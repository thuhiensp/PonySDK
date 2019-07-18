/*
 * Copyright 2019 SmartTrade Technologies
 *     Pony SDK
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ponysdk.core.ui2.css.cssom;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ponysdk.core.ui2.PEventAttributesName;
import com.ponysdk.core.ui2.PAttributeNames;
import com.ponysdk.core.ui2.PLeafTypeWithArgs;
import com.ponysdk.core.ui2.geometry.PDOMMatrix;
import com.ponysdk.core.ui2.geometry.PDOMMatrixReadOnly;

public class PCSSMatrixComponent extends PCSSTransformComponent {
    private static final Logger log = LoggerFactory.getLogger(PCSSMatrixComponent.class);
     private PDOMMatrix matrix;

    public PCSSMatrixComponent(PDOMMatrixReadOnly matrix){
      applyInit(widgetWithArgs(), new Object[]{matrix});
    }

    public PCSSMatrixComponent(PDOMMatrixReadOnly matrix, PCSSMatrixComponentOptions options){
      applyInit(widgetWithArgs(), new Object[]{matrix, options});
    }


    public void setMatrix(final PDOMMatrix matrix)  {
       if (Objects.equals(this.matrix, matrix))return;
       this.matrix = matrix;
       log.info("matrix" + matrix);
       saveUpdateAttribute(PAttributeNames.MATRIX,matrix);
    }

    public PDOMMatrix getMatrix(){
      return matrix;
    }

    private PLeafTypeWithArgs widgetWithArgs() {
      return PLeafTypeWithArgs.CSS_MATRIX_COMPONENT;
    }


}