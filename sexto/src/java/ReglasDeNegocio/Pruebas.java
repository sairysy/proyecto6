/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import java.util.ArrayList;
import AccesoADatos.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Cristian
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        
//         ArrayList<Producto> lista= new ArrayList<Producto>();
//         lista=Producto.producto_buscarporid(3);
//         if (lista.size()!=0)
//          {
//               for(Producto rec: lista)
//                {
//
//                         System.out.println(rec.getNombreproducto());
//                }
//             }
//            else
//                {
//                System.out.println("No hay registro");
//                }
//             }
//    
//           Producto obj=new Producto();
//obj.setNombreproducto("Cable ");
//
//    Producto.producto_insertar(obj);
//
////    
////    }
//// 
//        ArrayList<Proveedor> lista= new ArrayList<Proveedor>();
//         lista=Proveedor.proveedor_buscartodos();
//         if (lista.size()!=0)
//          {
//               for(Proveedor rec: lista)
//                {
//                         System.out.println(rec.getNombreproveedor());
//                         System.out.println(rec.getProveedorid());
//                         System.out.println(rec.getDireccion());
//                         System.out.println(rec.getTelefono());
//                }
//             }
//            else
//                {
//                System.out.println("No hay registro");
//                }
////
////       
//    }
//     ArrayList<Proveedor> lista= new ArrayList<Proveedor>();
//         lista=Proveedor.proveedor_buscarporid(1);
//         if (lista.size()!=0)
//          {
//               for(Proveedor rec: lista)
//                {
//                         System.out.println(rec.getNombreproveedor());
//                         System.out.println(rec.getProveedorid());
//                         System.out.println(rec.getDireccion());
//                         System.out.println(rec.getTelefono());
//                }
//             }
//            else
//                {
//                System.out.println("No hay registro");
//                }
////
////       
//    }
// Proveedor obj=new Proveedor();
//obj.setNombreproveedor("Cable rj");
//obj.setDireccion("Cable c");
//obj.setTelefono("2605618");
//
//    Proveedor.proveedor_insertar(obj);

    //  ELIMINAR
//    Proveedor.proveedor_eliminar(6);
//
////    EDITAR
//Producto obj=new Producto();
//obj.setNombreproducto("Cable UTP");
//obj.setProductoid(6);
//    Producto.producto_editar(obj);
//editar provedor
Proveedor obj=new Proveedor();
obj.setNombreproveedor("Covipal");
obj.setProveedorid(7);
obj.setDireccion("caminos al sol");
obj.setTelefono("33333");
    Proveedor.proveedor_editar(obj);

    }

    
}
