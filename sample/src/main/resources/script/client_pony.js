
window.onload = function() {
  $.when(
    $.getScript( 'arrayOfCreateLeafTypeNoArgs.js' ),
    $.getScript( 'arrayOfCreateLeafTypeWithArgs.js'  ),
    $.getScript( 'arrayOfAllAttributes.js'  ),
    $.getScript( 'arrayOfEventAttributesJs.js' ),
    $.Deferred(function( deferred ){
        $( deferred.resolve );
    })
).done(function() {

	//console.log(arrayOfAllAtributes);
  
    // var form = document.getElementById('message-form');
    // var messageField = document.getElementById('message');
    // var messagesList = document.getElementById('messages');
    // var socketStatus = document.getElementById('status');
    // var closeBtn = document.getElementById('close');

     // Create a global variable map to save all widgets created. 
     var map = new Map();
     var mapIDbyObject = new Map();
    // Create a new WebSocket.
    var socket = new WebSocket('ws://localhost:8081/sample/ws?c=');
    
    //ordinal of model of Server to client. For a moment, it is ok, not need generate.
    const ROUNDTRIP_LATENCY = 0;
    const POBJECT2_TYPE_CREATE = 222;
    const POBJECT2_TYPE_ADD = 223;
    const POBJECT2_LEAF_TYPE = 224;
    const POBJECT2_PARENT_OBJECT_ID = 225;
    const POBJECT2_TYPE_UPDATE = 227; 
    const POBJECT2_NUM_ATTRIBUTE = 228;
    const POBJECT2_ATTRIBUTE_VALUE_TEXT =229;
    const POBJECT2_ATTRIBUTE_VALUE_LONG =230;
    const POBJECT2_ATTRIBUTE_VALUE_DOUBLE = 231;
    const POBJECT2_ATTRIBUTE_VALUE_BOOLEAN =232;
    const POBJECT2_ATTRIBUTE_VALUE_INT = 233;
    const POBJECT2_ATTRIBUTE_VALUE_SHORT = 234;
    const POBJECT2_CONSTRUCTOR_NONARGUMENT = 235;
    const POBJECT2_CONSTRUCTOR_ARGUMENTS = 236;
    const POBJECT2_ARRAY_ARGUMENTS = 237;
    const POBJECT2_ATTRIBUTE_VALUE_BYTE =238;
    const PHANDLER_ID = 239;
    const POBJECT2_TYPE_ADD_HANDLE = 9;
    const PEVENT_INFO = 240;
 
    

    //Array Value Model => corespond enum ArrayValueModel of Pony SDK Server.

    const NULL_ARRAY_MODEL = 0;
    const BOOLEAN_FALSE_ARRAY_MODEL = 1;
    const BOOLEAN_TRUE_ARRAY_MODEL = 2;
    const BYTE_ARRAY_MODEL = 3;
    const SHORT_ARRAY_MODEL = 4;
    const INTEGER_ARRAY_MODEL = 5;
    const LONG_ARRAY_MODEL = 6;
    const DOUBLE_ARRAY_MODEL = 7;
    const FLOAT_ARRAY_MODEL = 8;
    const STRING_ASCII_UINT8_LENGTH_ARRAY_MODEL = 9;
    const STRING_ASCII_UINT16_LENGTH_ARRAY_MODEL = 10;
    const STRING_UTF8_UINT8_LENGTH_ARRAY_MODEL = 11;
    const STRING_UTF8_UINT16_LENGTH_ARRAY_MODEL = 12;
    const STRING_UTF8_INT32_LENGTH_ARRAY_MODEL = 13;



   
    // to save the order of message received.
    var order = 0;
   
    // Handle any errors that occur.
    socket.onerror = function(error) {
      console.log('WebSocket Error: ' + error);
    };
  
  
    // Show a connected message when the WebSocket is opened.
    // socket.onopen = function(event) {
        // socketStatus.innerHTML = 'Connected to: ' + event.currentTarget.url;
        // socketStatus.className = 'open';
    // };
  
   
    // Handle messages sent by the server.
    socket.onmessage = function(event) {
      var blob = event.data;
      var fileReader = new FileReader();
      console.log("information sur Message Event " + event);
      fileReader.readAsArrayBuffer(blob);
      fileReader.onload = function(event) {
          var arrayBuffer = event.target.result;
          var dataview = new DataView(arrayBuffer);
          read_message(dataview,arrayBuffer);    
        }
          
      };	
       
    function read_message(data_view,array_buffer){
    var begin_message = data_view.getUint8(0);
    switch(begin_message){
        case ROUNDTRIP_LATENCY:{
            read_last_message();
            break;
        }
        case POBJECT2_TYPE_CREATE:{
            read_message_type_creat(data_view);
           // write_message(data_view)
            break; 
        }
        case POBJECT2_TYPE_ADD:{
            read_message_type_add(data_view);
            //write_message(data_view)
            break;
        }
        case POBJECT2_TYPE_UPDATE:{
            read_message_type_update_attribute(data_view,array_buffer);
            //write_message(data_view)
            break;
        }
        case POBJECT2_TYPE_ADD_HANDLE:{
          read_message_type_add_handle(data_view, array_buffer);
          //write_message(data_view);
          break;
        }
     }
    }

    //function: read message start by ROUNDTRIP_LATENCY.
    function read_last_message(){
        var msg = {"h": 0};
        socket.send(JSON.stringify(msg));    
   }

   //function to read message of type creat. It recouver id of object and the ordinal of LeafType and then put them in our Map!
   function read_message_type_creat(data_view){
    var object_id_create = data_view.getUint16(1);
    console.log("id of object to create is" + object_id_create);
    var object_type_create ;
    
    if (data_view.getUint8(3) === POBJECT2_CONSTRUCTOR_NONARGUMENT) {
      object_type_create = arrayOfCreateLeafTypeNoArgs[data_view.getInt16(4)](); 
      //object_type_create.setAttribute("data-id", object_id_create);
      console.log ("ordianl of widget to create is" + data_view.getInt16(4));
      console.log("widget to create is" + object_type_create);
      } 
    if (data_view.getUint8(3) === POBJECT2_CONSTRUCTOR_ARGUMENTS)  {
      var idOfWidgetWithArgs = data_view.getUint8(4);
      console.log("idOfWidgetWithArgs" + idOfWidgetWithArgs);
      var arrayOfArgs = read_data_array(data_view,6);
      console.log("can read array of argsmmmmmm?" + arrayOfArgs);
      object_type_create = arrayOfCreateLeafTypeWithArgs[idOfWidgetWithArgs](arrayOfArgs);
      //object_type_create.setAttribute("data-id", object_id_create);
      console.log("id of widget to create is" + idOfWidgetWithArgs);
    }
    
   
    map.set(object_id_create,object_type_create);
    mapIDbyObject.set(object_type_create,object_id_create);
    console.log ("hahahhaha" + map);
    }

     //function to read message of type add a widget into it parent widget.
     function read_message_type_add(data_view){
      var id_widget_add = data_view.getUint16(1);
      var parent_object= map.get(data_view.getUint16(4));
      parent_object.appendChild(map.get(id_widget_add));
    }
  
    
    //function to read message of type update attributes of widget.
    function read_message_type_update_attribute(data_view,array_buffer){
      var id_widget = data_view.getUint16(1);
      var id_attribute =data_view.getUint16(4);
      console.log("id of attribute is" + id_attribute);
      var typeOfInput = data_view.getUint8(6);
      console.log ("type of attribute is" + typeOfInput);
      //informations from message;
      var object = map.get(id_widget);
      var functionSetAttribute= arrayOfAllAttributes[id_attribute];
      var contentOfMessage = readContentOfInput(typeOfInput,data_view,array_buffer);
      functionSetAttribute(object,contentOfMessage);
  
    }
    // function to read message type add handler of widget.
    function read_message_type_add_handle(data_view, array_buffer){
      var id_widget = data_view.getUint16(1);
      var object = map.get(id_widget);
      var id_attribute = data_view.getUint16(4);
      var id_handler = data_view.getUint16(7);
      var arrayEventInfo;
      var objectEventInfo = {};
     
      console.log ("understand message of add handle id widget: " + id_widget + " object related is " + object + "id of Attribute " + id_attribute + "id of handler" + id_handler);
      var functionSetAttribute =  arrayOfAllAttributes[id_attribute];
      var eventInstruction = function(e){
      var objectJS = {"0": id_widget, "g": id_attribute, "y":  e.constructor.name, "w" : id_handler};
      console.log("info sur evenement est " + e.constructor.name);
      if (data_view.byteLength >11){
        arrayEventInfo = read_data_array(data_view,10);
        console.log("do you understande" + arrayEventInfo);
        for (var index = 0; index < arrayEventInfo.length; index++){
          var idOfEventAttribute = arrayEventInfo[index];
		  console.log("can read id of event attribute?" + idOfEventAttribute);
          arrayOfAllEventAttributes[idOfEventAttribute](objectEventInfo,e);
         
        }
      }
      console.log("do you understand eventInfo" + Object.keys(objectEventInfo));
      console.log("do you understand eventInfo" + Object.values(objectEventInfo));
      if (data_view.byteLength >11) socket.send(stringifyEvent(objectJS,objectEventInfo));
      else socket.send(stringifyEvent(objectJS));
      //socket.send(stringifyEvent1(e,objectJS)); //if send all info of event.
      // socket.send(JSON.stringify(e));
       e.preventDefault();
    }
    functionSetAttribute(object,eventInstruction);
  }

  function stringifyEvent(jsobject,objectEventInfo) {
  
    const f = {"z":  objectEventInfo};
    const combiner =  { ...jsobject, ...f };
    const d = {"5": [combiner]};

    return JSON.stringify(d, (k, v) => {
      if (v instanceof Window) return null;
      if (v instanceof Document) return null;
      //if (v instanceof Node) return v.dataset.id;
      if (v instanceof Node) return mapIDbyObject.get(v);
      return v;
    }, ' ');
  }


  function stringifyEvent1(e, jsobject) {
    const eventToJsObject = {};
    for (let k in e) {
      //console.log("what is type of k???" + k);
      eventToJsObject[k] = e[k];
    }
    const f = {"z":  eventToJsObject};
    const combiner =  { ...jsobject, ...f };
    const d = {"5": [combiner]};

    return JSON.stringify(d, (k, v) => {
      if (v instanceof Window) return null;
      if (v instanceof Document) return null;
      //if (v instanceof Node) return v.dataset.id;
      if (v instanceof Node) return mapIDbyObject.get(v);
      return v;
    }, ' ');
  }


    //Show a disconnected message when the WebSocket is closed.
    // socket.onclose = function(event) {
      // socketStatus.innerHTML = 'Disconnected from WebSocket.';
      // socketStatus.className = 'closed';
    // };
  
  
    // Send a message when the form is submitted.
    // form.onsubmit = function(e) {
      // e.preventDefault();
  
     // Retrieve the message from the textarea.
      // var message = messageField.value;
  
    //  Send the message through the WebSocket.
      // socket.send(message);
  
    //  Add the message to the messages list.
      // messagesList.innerHTML += '<li class="sent"><span>Sent:</span>' + message + '</li>';
  
     // Clear out the message field.
      // messageField.value = '';
  
      // return false;
    // };
  
  
    // Close the WebSocket connection when the close button is clicked.
    // closeBtn.onclick = function(e) {
      // e.preventDefault();
  
      //Close the WebSocket.
      // socket.close();
  
      // return false;
    // };
    

   

    //function write message in client side.
    // function write_message(data_view){
        // order ++;
        // var str = "";
        // for (var i = 0; i < data_view.byteLength; i++){
        // str = str + data_view.getUint8(i) + ",";
        // } 
        // messagesList.innerHTML += '<li class="received", id = $order> <span>Received:</span>' +  "message" + order + "-th " +  str + " (size =" + data_view.byteLength + ")" + '</li>';

    // }

    
   


  //function read content of attribute to modify.

  function readContentOfInput(typeOfInput,data_view,array_buffer){
    switch(typeOfInput){
      case  POBJECT2_ATTRIBUTE_VALUE_TEXT :{
        var content = read_data_string(array_buffer,8,data_view.byteLength-1);
        console.log("content is readable?" + content);
        return content;
      }
      case POBJECT2_ATTRIBUTE_VALUE_BOOLEAN :{
        var content = read_data_boolean(data_view,7);
        console.log("content is readable?" + content);
        return content;
      }
      case POBJECT2_ATTRIBUTE_VALUE_LONG :{
        var content = read_data_long(data_view, 7);
        console.log("content is readable?" + content);
        return content;
      }
      case POBJECT2_ATTRIBUTE_VALUE_DOUBLE :{
        var content = read_data_double(data_view, 7);
        console.log("content is readable?" + content);
        return content;
      }
      case POBJECT2_ATTRIBUTE_VALUE_INT :{
        var content = read_data_int(data_view, 7);
        console.log("content is readable?" + content);
        return content;
      }
      case POBJECT2_ATTRIBUTE_VALUE_SHORT :{
        var content = read_data_short(data_view, 7);
        console.log("content is readable?" + content);
        return content;
      }
      case POBJECT2_ATTRIBUTE_VALUE_BYTE:{
        var content = read_data_byte(data_view, 7);
        console.log("content byte is readable?" + content);
        return content;
      }
    }
  }

  function getInfoElementArray(data_view, position){
    var value;
    switch(data_view.getUint8(position)){
      case NULL_ARRAY_MODEL:{
        break;
      }
      case BOOLEAN_FALSE_ARRAY_MODEL:{
      }
      case BOOLEAN_TRUE_ARRAY_MODEL:{
         value = read_data_boolean(data_view,position + 1);
        return [1,value];
      }
      case BYTE_ARRAY_MODEL:{
        value = read_data_byte(data_view,position + 1);
        return [1,value];
      }
      case SHORT_ARRAY_MODEL:{
        value = read_data_short(data_view,position+1);
        return [2,value];
      }
      case INTEGER_ARRAY_MODEL:{
        value = read_data_int(data_view,position+1);
        //console.log("read data as integer" + value);
          return [4,value];
      }
      case LONG_ARRAY_MODEL:{
        value = read_data_long(data_view,position+1);
        return [8,value];
      }
      case DOUBLE_ARRAY_MODEL:{
        value = read_data_double(data_view, position +1);
        return [8,value];
      }
      case FLOAT_ARRAY_MODEL:{
       value = read_data_float(data_view,position+1);
       //console.log("read data as float" + value);
        return [4,value];
      }
      case STRING_ASCII_UINT8_LENGTH_ARRAY_MODEL:{
        var arraySize = data_view.getUint8(position+1);
       // console.log("can read array size" + arraySize);
        var position_end = position + 2 + arraySize;
       // console.log("can read position end" + position_end);
        var array_buffet = data_view.buffer;
        value = read_data_string(array_buffet, position +2, position_end);
        //console.log("can read string" + value);
        return [1 + arraySize,value];
      }
      case STRING_UTF8_UINT8_LENGTH_ARRAY_MODEL:{
        var arraySize = data_view.getUint8(position+1);
        position_end = position + 2 + arraySize;
        array_buffet = data_view.buffer;
        value = read_data_string(array_buffet, position +2, position_end);
        return  new Array(1 + arraySize,value);
      }
      case STRING_ASCII_UINT16_LENGTH_ARRAY_MODEL:{
        var arraySize = data_view.getUint16(position+1);
        position_end = position + 2 + data_view.getUint16(position +1);
        array_buffet = data_view.buffer;
        value = read_data_string(array_buffet, position +2, position_end);
        return [2 + arraySize,value];
      }
      case STRING_UTF8_UINT16_LENGTH_ARRAY_MODEL:{
        var arraySize = data_view.getUint16(position+1);
        position_end = position + 2 + data_view.getUint16(position +1);
        array_buffet = data_view.buffer;
        value = read_data_string(array_buffet, position +2, position_end);
        return [2 + arraySize,value]; 
      }
      case STRING_UTF8_INT32_LENGTH_ARRAY_MODEL:{
        var arraySize = data_view.getInt32(position+1);
        position_end = position + 4 + data_view.getUint16(position +1);
        array_buffet = data_view.buffer;
        value = read_data_string(array_buffet, position +2, position_end);
        return [4 + arraySize,value]; 
      }
    }
  }

  //read value of widget attribute as String.
    function read_data_string(array_buffet, position_begin, position_end){
      var slice = array_buffet.slice(position_begin,position_end);
      var win1251decoder = new TextDecoder("utf8");
      return win1251decoder.decode(slice); 
      //return String.fromCharCode(slice);
  }


  function read_data_stringASCII(array_buffet, position_begin, position_end){
    var slice = array_buffet.slice(position_begin,position_end);
    var win1251decoder = new TextDecoder();
    return String.fromCharCode.apply(null,slice); 
    //return String.fromCharCode(slice);
}

function read_data_stringUTF8(array_buffet, position_begin, position_end){
  var slice = array_buffet.slice(position_begin,position_end);
  var win1251decoder = new TextDecoder();
  return String.fromCharCode(null,slice);
}
  //read value of widget attribute as Long
  function read_data_long(data_view, position_in_byte){
      var result = ( data_view.getInt32(position_in_byte, false) << 32)
      + (data_view.getUint32( position_in_byte +4, false));    
      return result;
  }
  
   //read value of widget attribute as Boolean.
   function read_data_boolean(data_view, position_in_byte){
      var res = data_view.getInt8(position_in_byte);
      return (res == 0? false: true) ; 
  }

  //read data as byte
  function read_data_byte(data_view, position_in_byte){
    var res = data_view.getUint8(position_in_byte);
    return res;
  }

  //read data as short.
  function read_data_short(data_view, position_in_byte){
    var res = data_view.getInt16(position_in_byte);
    return res;
  }

  function read_data_int(data_view, position_in_byte){
    var res = data_view.getInt32(position_in_byte);
    return res;
  }

  function read_data_double(data_view, position_in_byte){
    var res = data_view.getFloat64(position_in_byte);
    return res;
  }

  function read_data_float(data_view, position_in_byte){
    var res = data_view.getFloat32(position_in_byte);
    return res;
  }

   //read value of a array.
   function read_data_array(data_view, position_begin){
    var result = [];
    var arraySize = data_view.getUint8(position_begin);
    console.log("can read arraySize" + arraySize);
    var position = position_begin +1;
    var value;
    for (var i = 0; i < arraySize; i++){
      value = getInfoElementArray(data_view, position)[1];
      console.log ("can read value" + value);
      result.push(value);
      position = position + getInfoElementArray(data_view, position)[0] + 1;
      console.log("can read position" + position);
    }
    return result;
   }

  });
}

// Id of widget type, recover from PLeafType.java. It must be generate automatic!!! For a moment, a map instance of array.
  
  // table of all attributes. For a moment, a map instance of array.
    //var arrayOfAllAtributes =  require('./arrayOfAllAttributes.js').arrayOfAllAtributes;
    //=  new Map([[594, "value"], [504, "readOnly"], [174, "innerHTML"]])
 //Attribues of all POBJECT2. It must be generate automatic FROM PAttributeNames.java!!!
//  const PATTRIBUTE_VALUE = 594;
//  const PATTRIBUTE_READ_ONLY = 504;
//  const PATTRIBUTE_INNERHTML = 174;   

 window.onresize = function() {
   console.log ("HAIZZZZZZZZZZZZ!");
 }   