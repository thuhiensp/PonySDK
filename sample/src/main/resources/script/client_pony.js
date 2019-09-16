//var propositionGlobal;
window.onload = function () {
  $.when(
    $.getScript('arrayOfCreateLeafTypeNoArgs.js'),
    $.getScript('arrayOfCreateLeafTypeWithArgs.js'),
    $.getScript('arrayOfAllAttributes.js'),
    $.getScript('arrayOfEventAttributesJs.js'),
    $.getScript('constantsOfLeafTypeNoArgJs.js'),
    $.getScript('constantsServerToClientModelJs.js'),
    $.getScript('constantsArrayValueModelJs.js'),
    $.getScript('arrayOfAllMethodNamesJs.js'),
    //$.getScript( 'readDataJS.js'),
    $.Deferred(function (deferred) {
      $(deferred.resolve);
    })
  ).done(function () {

    const BYTE_LENGTH = 1;
    const SHORT_LENGTH = 2;
    const INTEGER_LENGTH = 4;
    const LONG_LENGTH = 8;

    //TO decode String

    const STRING_ASCII_UINT8_MAX_LENGTH = 250;
    const STRING_ASCII_UINT16 = 251;
    const STRING_ASCII_INT32 = 252;
    const STRING_UTF8_UINT8 = 253;
    const STRING_UTF8_UINT16 = 254;
    const STRING_UTF8_INT32 = 255;

    var map = new Map();
    var mapIDbyObject = new Map();
    //var mapWindowManager = new Map();
    var listAllWindows = [];
    // Create a new WebSocket.
    var socket = new WebSocket('ws://localhost:8081/sample/ws?c=');

    // Handle any errors that occur.
    socket.onerror = function (error) {
      console.log('WebSocket Error: ' + error);
    };

    socket.onmessage = function (event) {
      var blob = event.data;
      var fileReader = new FileReader();
      console.log("information sur Message Event " + blob);
      fileReader.readAsArrayBuffer(blob);
      
      fileReader.onload = function (event) {
        var arrayBuffer = event.target.result;
        var dataview = new DataView(arrayBuffer);
        read_message(dataview, arrayBuffer, 0);
      }
    };


    function read_message(data_view, array_buffer, position) { //To Delelte array_buffer
      var begin_message = data_view.getUint8(position);
      position = position + BYTE_LENGTH;
      switch (begin_message) {
        case ROUNDTRIP_LATENCY: {
          read_last_message();
          break;
        }
        case WINDOW_ID: {
          read_Window_message(data_view, position);
          break;
        }
        case POBJECT2_TYPE_CREATE: {
          read_message_type_creat(data_view, position);
          break;
        }
        case POBJECT2_TYPE_ADD: {
          read_message_type_add(data_view, position);
          break;
        }
        case POBJECT2_TYPE_UPDATE: {
          read_message_type_update_attribute(data_view, array_buffer, position);
          break;
        }
        case TYPE_ADD_HANDLER: {
          read_message_type_add_handle(data_view, array_buffer, position);
          break;
        }
        case POBJECT2_TYPE_EXISTING: {
          read_message_type_existing(data_view, position);
          break;
        }
        case POBJECT2_WINDOW_CLOSE: {
          read_message_window_close(data_view, position);
          break;
        }
        case POBJECT2_METHOD_VOID: {
          read_message_method_void(data_view, array_buffer, position);
          break;
        }
        case POBJECT2_METHOD: {
          read_message_method(data_view,array_buffer,position);
          break;
        }
        case  POBJECT2_TYPE_REMOVE_CHILD: {
          console.log("understand remove ???");
          read_message_remove_child(data_view, array_buffer,position);
          break;
        }
      }
    }

    //function: read message start by ROUNDTRIP_LATENCY.

    function read_last_message() {
      var msg = { "h": 0 };
      socket.send(JSON.stringify(msg));
    }



    //function to read message type window id
    function read_Window_message(data_view, position) {
      var window_main_id = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      var objet_window_main = document.defaultView;
      position = position + BYTE_LENGTH; //ServerToCLientModel : 1 byte.
      //var window_id_create = data_view.getUint16(position);
      var window_id_create = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      var object_window_create = null;
      if (window_main_id != window_id_create) {
        console.log("can i read message of window, window_id_create" + window_id_create);
        object_window_create = arrayOfCreateLeafTypeNoArgs[ID_WINDOW]();
      }
      console.log("understand type new window?" + object_window_create);
      listAllWindows.push(objet_window_main);
      if (!map.has(window_id_create) && object_window_create != null) {
        listAllWindows.push(object_window_create);
      }

      map.set(window_id_create, object_window_create);
      map.set(window_main_id, objet_window_main);
      mapIDbyObject.set(object_window_create, window_id_create);
      mapIDbyObject.set(objet_window_main, window_main_id);
      propositionGlobal = position;
    }
    //function to read message type existing.
    function read_message_type_existing(data_view, position) {
      var object_id_create = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      position = position + BYTE_LENGTH;
      var window_id_attach = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      console.log("window_id_attach" + window_id_attach);
      var window_attach = map.get(window_id_attach);
      console.log("window_attach" + window_attach);
      var object_type_exising;
      position = position + BYTE_LENGTH;
      console.log("position::" + position);
      switch (data_view.getUint16(position)) { // to verify in case of a nagative short.
        case ID_HTML_DOCUMENT: {
          object_type_exising = window_attach.document;
          console.log("do you can get the HTML Document?" + object_type_exising);
          break;
        }
        case ID_HTML_HTML_ELEMENT: {
          object_type_exising = window_attach.document.documentElement;
          break;
        }
        case ID_HTML_BODY_ELEMENT: {
          object_type_exising = window_attach.document.body;
          console.log("do you can get the Body?" + object_type_exising);
          break;
        }
      }
      map.set(object_id_create, object_type_exising);
      mapIDbyObject.set(object_type_exising, object_id_create);
      propositionGlobal = position;
    }

    //function to read message of type creat. It recouver id of object and the ordinal of LeafType and then put them in our Map!
    function read_message_type_creat(data_view, position) {
      var object_id_create = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      console.log("id of object to create is" + object_id_create);
      var object_type_create;
      console.log("huhu, do you understand type create " + data_view.getUint8(position));
      if (data_view.getUint8(position) === POBJECT2_CONSTRUCTOR_NONARGUMENT) {
        position = position + BYTE_LENGTH;
        object_type_create = arrayOfCreateLeafTypeNoArgs[data_view.getInt16(position)]();
        console.log ("object type create is " + object_type_create);
      }
      if (data_view.getUint8(position) === POBJECT2_CONSTRUCTOR_ARGUMENTS) {
        position = position + BYTE_LENGTH;
        var idOfWidgetWithArgs = data_view.getUint8(position);
        console.log("idOfWidgetWithArgs" + idOfWidgetWithArgs);
        position = position + BYTE_LENGTH + BYTE_LENGTH;
        var arrayOfArgs = read_data_array(data_view, position);
        object_type_create = arrayOfCreateLeafTypeWithArgs[idOfWidgetWithArgs](arrayOfArgs);
      }
      map.set(object_id_create, object_type_create);
      mapIDbyObject.set(object_type_create, object_id_create);

      if (object_type_create.constructor.name == "Window") treat_type_window(object_id_create, object_type_create);
 
    }

    function treat_type_window(object_id, object_create) {
      listAllWindows.push(object_create);
      object_create.onunload = function (e) {
        var objectJs = { "5": [{ "0": object_id, "F": 0 }] };
        socket.send(JSON.stringify(objectJs));
      }
    }

    //function to read message of type add a widget into it parent widget.
    function read_message_type_add(data_view, position) {
      var id_widget_add = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      position = position + BYTE_LENGTH;
      var child_object = map.get(id_widget_add);
      var parent_object = map.get(read_data_UInt31(data_view, position)[1]);
      position = read_data_UInt31(data_view, position)[0];
      console.log("widget type add has id" + id_widget_add);
      console.log("widget parent is" + parent_object);
      if (parent_object.constructor.name == "Window") {
        add_widget_for_Window(parent_object, child_object);
      }
      else parent_object.appendChild(child_object);
    }


    //function to read message of type update attributes of widget.
    function read_message_type_update_attribute(data_view, array_buffer, position) {
      var id_widget = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      position = position + BYTE_LENGTH;
      var id_attribute = data_view.getUint16(position);
      console.log("id of attribute is" + id_attribute);
      position = position + SHORT_LENGTH;
      //informations from message;
      var object = map.get(id_widget);
      var functionSetAttribute = arrayOfAllAttributes[id_attribute];
      var contentOfMessage = readContentOfInput(data_view, array_buffer, position);
      functionSetAttribute(object, contentOfMessage);
    }

    // function to read message type add handler of widget.
    function read_message_type_add_handle(data_view, array_buffer, position) {
      var id_widget = read_data_UInt31(data_view, position)[1]; // position = 1;
      position = read_data_UInt31(data_view, position)[0];     // position = 3 ou position = 5 (if ID is encoded as a integer).
      var object = map.get(id_widget);
      position = position + BYTE_LENGTH; // position = 4 (ou 6).
      var id_attribute = data_view.getUint16(position);
      position = position + SHORT_LENGTH; // position = 6 (ou 8).
      var arrayEventInfo;
      var objectEventInfo = {};

      //console.log ("understand message of add handle id widget: " + id_widget + " object related is " + object + "id of Attribute " + id_attribute + "id of handler" + id_handler);
      var functionSetAttribute = arrayOfAllAttributes[id_attribute];
      var eventInstruction = function (e) {
        var objectJS = { "0": id_widget, "g": id_attribute, "y": e.constructor.name };
        console.log("info sur evenement est " + e.constructor.name);
        if (data_view.byteLength > position + 1) {
          // this cas contains the event info wchich is encoded as un array. In the constract case, the last byte (coresspondant position +1 is the end of message)
          console.log("do you understande cette position" + position);
          arrayEventInfo = read_data_array(data_view, position + 1);
          console.log("do you understande" + arrayEventInfo);
          for (var index = 0; index < arrayEventInfo.length; index++) {
            var idOfEventAttribute = arrayEventInfo[index];
            console.log("can read id of event attribute?" + idOfEventAttribute);
            arrayOfAllEventAttributes[idOfEventAttribute](objectEventInfo, e);
          }
        }
        console.log("do you understand eventInfo" + Object.keys(objectEventInfo));
        console.log("do you understand object eventInfo" + Object.values(objectEventInfo));
        if (data_view.byteLength > 9) socket.send(stringifyEvent(objectJS, objectEventInfo));
        else socket.send(stringifyEvent(objectJS));
        //socket.send(stringifyEvent1(e,objectJS)); //if send all info of event.
        // socket.send(JSON.stringify(e));
        e.preventDefault();
      }
      functionSetAttribute(object, eventInstruction);
    }

    function read_message_window_close(data_view, position) {
      var window_id = read_data_UInt31(data_view, position)[1];
      position = position + read_data_UInt31(data_view, position)[0];
      var object_window = map.get(window_id);
      object_window.close();
    }


    function read_message_remove_child(data_view, array_buffer,position){
      var objectIdRemove = read_data_UInt31(data_view,position)[1];
      console.log ("understand object id to remove" + objectIdRemove);
      position = position + read_data_UInt31(data_view, position)[0];
      var objectRemove = map.get(objectIdRemove);
      objectRemove.remove();
      //map.delete(objectIdRemove);

    }
    function read_message_method_void(data_view, array_buffer, position) {
      var object_id = read_data_UInt31(data_view, position)[1];
      position =  read_data_UInt31(data_view, position)[0];
      var object = map.get(object_id);
      position = position + BYTE_LENGTH;
      var method_id = data_view.getUint16(position);
      position = position + SHORT_LENGTH;
      var methodToCall = arrayOfAllMethods[method_id];
      var arrayOfArgs = [] ;
      if (data_view.byteLength > 8){
        position = position + BYTE_LENGTH;
        arrayOfArgs = read_data_array(data_view, position);
      }
      methodToCall(object, arrayOfArgs);
    }

    function read_message_method(data_view,array_buffer,position){
      var object_id = read_data_UInt31(data_view, position)[1];
      position = read_data_UInt31(data_view, position)[0];
      var object = map.get(object_id);
      console.log ("object id is " + object);
      position = position + BYTE_LENGTH;
      var method_id = data_view.getUint16(position);
      console.log ("method id is " + method_id);
      position = position + SHORT_LENGTH;
      position = position + BYTE_LENGTH;
      var iDCbacks = read_data_UInt31(data_view,position)[1];
      position =  read_data_UInt31(data_view, position)[0];
      position = position + BYTE_LENGTH;
      var arrayOfArgs = [];
      if (data_view.byteLength > position){
      arrayOfArgs = read_data_array(data_view,position);
      arrayOfArgs[0] = map.get(arrayOfArgs[0]);
      console.log ("object in argument is " + arrayOfArgs[0]);
    }
      var result = arrayOfAllMethods[method_id](object,arrayOfArgs);
      console.log("We can get result?" + result);
      objectJsToServer = {"5": [{"0" : object_id, "W": iDCbacks, "Z": method_id, "t": result}]};
      socket.send(JSON.stringify(objectJsToServer));
    }

    function stringifyEvent(jsobject, objectEventInfo) {

      const f = { "z": objectEventInfo };
      const combiner = { ...jsobject, ...f };
      const d = { "5": [combiner] };

      return JSON.stringify(d, (k, v) => {
        if (v instanceof EventTarget) return mapIDbyObject.get(v);
        return v;
      }, ' ');
    }





    function add_widget_for_Window(window, widget) {
      console.log("hahahah you can get  of new window?" + window);
      var body_of_window = window.document.getElementsByTagName("body")[0];
      console.log("hahahah you can get the body of new window?" + body_of_window);
      body_of_window.appendChild(widget);
    }

    //function read content of attribute to modify.

    function readContentOfInput(data_view, array_buffer, position) {
      var typeOfInput = data_view.getUint8(position);
      position = position + BYTE_LENGTH;
      switch (typeOfInput) {
        case POBJECT2_ATTRIBUTE_VALUE_TEXT: {
          var content = read_data_string(data_view, array_buffer, position, data_view.byteLength - 1);
          console.log("content is readable?" + content);
          return content;
        }
        case POBJECT2_ATTRIBUTE_VALUE_BOOLEAN: {
          var content = read_data_boolean(data_view, position);
          console.log("content is readable?" + content);
          return content;
        }
        case POBJECT2_ATTRIBUTE_VALUE_LONG: {
          var content = read_data_long(data_view, position);
          console.log("content is readable?" + content);
          return content;
        }
        case POBJECT2_ATTRIBUTE_VALUE_DOUBLE: {
          var content = read_data_double(data_view, position);
          console.log("content is readable?" + content);
          return content;
        }
        case POBJECT2_ATTRIBUTE_VALUE_INT: {
          var content = read_data_int(data_view, position);
          console.log("content is readable?" + content);
          return content;
        }
        case POBJECT2_ATTRIBUTE_VALUE_SHORT: {
          var content = read_data_short(data_view, position);
          console.log("content is readable?" + content);
          return content;
        }
        case POBJECT2_ATTRIBUTE_VALUE_BYTE: {
          var content = read_data_byte(data_view, position);
          console.log("content byte is readable?" + content);
          return content;
        }
        case POBJECT2_ID_OBJECT: {
          var content = read_data_object(data_view, position);
          console.log("content object id is readable?" + content);
          return content;
        }
      }
    }

    function getInfoElementArray(data_view, position) {
      var value;
      var arrayValueModel = data_view.getUint8(position);
      position = position + BYTE_LENGTH;
      switch (arrayValueModel) {
        case NULL_ARRAY_MODEL: {
          break;
        }
        case BOOLEAN_FALSE_ARRAY_MODEL: {
        }
        case BOOLEAN_TRUE_ARRAY_MODEL: {
          value = read_data_boolean(data_view, position);
          return [1, value];
        }
        case BYTE_ARRAY_MODEL: {
          value = read_data_byte(data_view, position);
          return [1, value];
        }
        case SHORT_ARRAY_MODEL: {
          value = read_data_short(data_view, position);
          return [2, value];
        }
        case INTEGER_ARRAY_MODEL: {
          value = read_data_int(data_view, position);
          //console.log("read data as integer" + value);
          return [4, value];
        }
        case LONG_ARRAY_MODEL: {
          value = read_data_long(data_view, position);
          return [8, value];
        }
        case DOUBLE_ARRAY_MODEL: {
          value = read_data_double(data_view, position);
          return [8, value];
        }
        case FLOAT_ARRAY_MODEL: {
          value = read_data_float(data_view, position);
          //console.log("read data as float" + value);
          return [4, value];
        }
        case STRING_ASCII_UINT8_LENGTH_ARRAY_MODEL: {
          var lengthString = data_view.getUint8(position);
          position = position + BYTE_LENGTH;
          var position_end = position + lengthString;
          var array_buffet = data_view.buffer;
          value = read_data_string_ASCII(array_buffet, position, position_end);
          return [1 + lengthString, value];
        }
        case STRING_UTF8_UINT8_LENGTH_ARRAY_MODEL: {
          var lengthString = data_view.getUint8(position);
          position = position + BYTE_LENGTH;
          position_end = position + lengthString;
          array_buffet = data_view.buffer;
          value = read_data_string_UTF8(array_buffet, position, position_end);
          return new Array(1 + lengthString, value);
        }
        case STRING_ASCII_UINT16_LENGTH_ARRAY_MODEL: {
          var lengthString = data_view.getUint16(position);
          position = position + SHORT_LENGTH;
          position_end = position + lengthString;
          array_buffet = data_view.buffer;
          value = read_data_string_ASCII(array_buffet, position, position_end);
          return [2 + lengthString, value];
        }
        case STRING_UTF8_UINT16_LENGTH_ARRAY_MODEL: {
          var lengthString = data_view.getUint16(position);
          position = position + SHORT_LENGTH;
          position_end = position + lengthString;
          array_buffet = data_view.buffer;
          value = read_data_string_UTF8(array_buffet, position, position_end);
          return [2 + lengthString, value];
        }
        case STRING_UTF8_INT32_LENGTH_ARRAY_MODEL: {
          var lengthString = data_view.getInt32(position);
          position = position + INTEGER_LENGTH;
          position_end = position + lengthString;
          array_buffet = data_view.buffer;
          value = read_data_string_UTF8(array_buffet, position, position_end);
          return [4 + lengthString, value];
        }
      }
    }

    //read value of widget attribute as String.
    function read_data_string1(array_buffet, position_begin, position_end) {
      var slice = array_buffet.slice(position_begin, position_end);
      var win1251decoder = new TextDecoder("utf8");
      return win1251decoder.decode(slice);
      //return String.fromCharCode(slice);
    }

    function read_data_string(data_view, array_buffer, position, position_end) {
      var typeOfString = data_view.getUint8(position);
      position = position + BYTE_LENGTH;
      var lengthOfString;
      console.log("Do you understand read data string" + typeOfString);
      if (typeOfString <= STRING_ASCII_UINT8_MAX_LENGTH) {
        position_begin = position;
        lengthOfString = typeOfString;
        return read_data_string_ASCII(array_buffer, position_begin, position_end);
      }
      if (typeOfString == STRING_ASCII_UINT16) {
        position_begin = position + SHORT_LENGTH;
        lengthOfString = data_view.getUint16(position);
        return read_data_string_ASCII(array_buffer, position_begin, position_end);
      }
      if (typeOfString == STRING_ASCII_INT32) {
        position_begin = position + LONG_LENGTH;
        lengthOfString = data_view.getInt32(position)
        return read_data_string_ASCII(array_buffer, position_begin, position_end);
      }
      if (typeOfString == STRING_UTF8_UINT8) {
        position_begin = position + BYTE_LENGTH;
        lengthOfString = data_view.getUint8(position);
        return read_data_string_UTF8(array_buffer, position_begin, position_end);
      }
      if (typeOfString == STRING_UTF8_UINT16) {
        position_begin = position + SHORT_LENGTH;
        lengthOfString = data_view.getUint16(position);
        console.log("string UTF8 UINT16");
        return read_data_string_UTF8(array_buffer, position_begin, position_end);
      }
      if (typeOfString == STRING_UTF8_INT32) {
        position_begin = position + LONG_LENGTH;
        lengthOfString = data_view.getInt32(position)
        return read_data_string_UTF8(array_buffer, position_begin, position_end);
      }
      position = position + lengthOfString;
    }


    //read value of widget attribute as String.
    function read_data_string_ASCII(array_buffer, position, position_end) {
      var slice = array_buffer.slice(position, position_end);
      var win1251decoder = new TextDecoder("ascii");
      return win1251decoder.decode(slice);
    }

    function read_data_string_UTF8(array_buffer, position_begin, position_end) {
      var slice = array_buffer.slice(position_begin, position_end);
      var win1251decoder = new TextDecoder("utf8");
      return win1251decoder.decode(slice);
    }
    //read value of widget attribute as Long
    function read_data_long(data_view, position_in_byte) {
      var result = (data_view.getInt32(position_in_byte, false) << 32)
        + (data_view.getUint32(position_in_byte + 4, false));
      return result;
    }

    //read value of widget attribute as Boolean.
    function read_data_boolean(data_view, position_in_byte) {
      var res = data_view.getInt8(position_in_byte);
      return (res == 0 ? false : true);
    }

    //read data as a unsign byte. In this new version of Pony, server send a byte only for the case of ordinal of enum. 
    //In the side of client, it must be read as a unsigne ( the index of an array is always positive).
    function read_data_byte(data_view, position_in_byte) {
      var res = data_view.getUint8(position_in_byte);
      return res;
    }

    //read data as short.
    function read_data_short(data_view, position_in_byte) {
      var res = data_view.getInt16(position_in_byte);
      return res;
    }

    function read_data_int(data_view, position_in_byte) {
      var res = data_view.getInt32(position_in_byte);
      return res;
    }

    function read_data_double(data_view, position_in_byte) {
      var res = data_view.getFloat64(position_in_byte);
      return res;
    }

    function read_data_float(data_view, position_in_byte) {
      var res = data_view.getFloat32(position_in_byte);
      return res;
    }

    function read_data_object(data_view, position_in_byte) {
      //var id_widget = data_view.getUint16(position_in_byte);
      var id_widget = read_data_UInt31(data_view, position_in_byte)[1];
      var object = map.get(id_widget);
      return object;
    }

    function read_data_UInt31(data_view, position) {
      var value = data_view.getInt16(position);
      if (value >= 0) {
        position = position + SHORT_LENGTH;
        return [position, value];
      }
      position = position + INTEGER_LENGTH;
      return [position, (value << 16 | data_view.getUint16(position - 2)) & 0x7F_FF_FF_FF];
    }

    //read value of a array.
    function read_data_array(data_view, position) {
      var result = [];
      var arraySize = data_view.getUint8(position);
      console.log("can read arraySize" + arraySize);
      var position_array = position + 1;
      var value;
      for (var i = 0; i < arraySize; i++) {
        value = getInfoElementArray(data_view, position_array)[1];
        result.push(value);
        position_array = position_array + getInfoElementArray(data_view, position_array)[0] + 1;
      }
      position = position_array;
      return result;
    }

    document.defaultView.onunload = function () {
      for (var window of listAllWindows) {
        window.close();
      }
    }


  });
}


