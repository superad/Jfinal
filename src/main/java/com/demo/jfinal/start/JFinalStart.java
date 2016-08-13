
package com.demo.jfinal.start;

import com.jfinal.core.JFinal;

/**
 * Created by fgm on 2016/8/11.
 */
public class JFinalStart {

    public static void main(String []args){
        JFinal.start("src/main/webapp",8080,"/",5);

    }

}
