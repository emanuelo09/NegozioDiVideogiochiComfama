package com.example.negoziodivideogiochi.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "foto")
    private String foto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precioUnitario")
    private Double precioUnitario;

    @Column(name = "clasificacion")
    private String clasificacion;

    @Column(name = "marca")
    private String marca;

    @Column(name = "presentacion")
    private String presentacion;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "estado")
    private Boolean estado;

    @Column(name = "proveedor")
    private String proveedor;

    @Column(name = "volumen")
    private Double volumen;

    @Column(name = "fechaIngreso")
    private String fechaIngreso;

    @Column(name = "fechaVencimiento")
    private String fechaVencimiento;

    @Column(name = "aplicaDescuento")
    private Boolean aplicaDescuento;

    @Column(name = "IVA")
    private String IVA;

    public Producto() {
    }

    public Producto(Integer id, String nombre, String foto, String descripcion, Integer cantidad, Double precioUnitario, String clasificacion, String marca, String presentacion, Double peso, Boolean estado, String proveedor, Double volumen, String fechaIngreso, String fechaVencimiento, Boolean aplicaDescuento) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.clasificacion = clasificacion;
        this.marca = marca;
        this.presentacion = presentacion;
        this.peso = peso;
        this.estado = estado;
        this.proveedor = proveedor;
        this.volumen = volumen;
        this.fechaIngreso = fechaIngreso;
        this.fechaVencimiento = fechaVencimiento;
        this.aplicaDescuento = aplicaDescuento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Boolean getAplicaDescuento() {
        return aplicaDescuento;
    }

    public void setAplicaDescuento(Boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }

    //Last Key
}
