/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import forms.Categoria;
import forms.Clientes;
import forms.Compra;
import forms.Crear_Factura;
import forms.Generar_Factura;
import forms.Marca;
import forms.Productos;
import forms.Usuarios;
import forms.Proveedores;

/**
 *
 * @author cerritos
 */
public class Cierres {
    
    public void Cierre(){
        Usuarios user=new Usuarios();
        Proveedores prov= new Proveedores();
        Clientes cli = new Clientes();
        Categoria cat = new Categoria();
        Crear_Factura nf= new Crear_Factura();
        Generar_Factura gf= new Generar_Factura();
        Marca ma= new Marca();
        Productos pro =new Productos();
        Compra co= new Compra();
        user.dispose();
        prov.dispose();
        cli.dispose();
        cat.dispose();
        nf.dispose();
        gf.dispose();
        ma.dispose();
        pro.dispose();
        co.dispose();
    }
    
    
}
