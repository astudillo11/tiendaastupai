package Producto;

/**
* Producto/ProductosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from producto.idl
* viernes 9 de noviembre de 2018 03:25:08 PM COT
*/

public final class ProductosHolder implements org.omg.CORBA.portable.Streamable
{
  public Producto.Productos value = null;

  public ProductosHolder ()
  {
  }

  public ProductosHolder (Producto.Productos initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Producto.ProductosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Producto.ProductosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Producto.ProductosHelper.type ();
  }

}
