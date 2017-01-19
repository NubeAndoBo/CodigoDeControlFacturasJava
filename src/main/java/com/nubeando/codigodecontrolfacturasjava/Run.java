/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubeando.codigodecontrolfacturasjava;

/**
 *
 * @author acq1305
 */
public class Run {

    //Numero de Autorizacion: 7904006306693
    //Numero de Factura:      876814
    //Numero de NIT:          1665979
    //Numero de Fecha:        20080519 (Con formato yyyyMMdd)
    //Numero de Total:        35959 (Redondeado)
    //Llave de Dosificacion:  zZ7Z]xssKqkEf_6K9uH(EcV+%x+u[Cca9T%+_$kiLjT8(zr3T9b5Fx2xG-D+_EBS
    //web normativa del codigo de control: http://impuestos.gob.bo/index.php?option=com_content&view=article&id=1564&Itemid=584
    public static void main(String[] args) {
        System.out.println(CodigoControl.controlCode("7904006306693", "876814", "1665979", "20080519", "35959", "zZ7Z]xssKqkEf_6K9uH(EcV+%x+u[Cca9T%+_$kiLjT8(zr3T9b5Fx2xG-D+_EBS"));
    //Resultado: "7B-F3-48-A8"
    }
}
