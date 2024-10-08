/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;
/**
 * 
 * @author Caroline Casteras
 * @param <T> 
 */
public interface Crudable<T> {
    
    public abstract T find(Long id);

    public abstract void persist(T obj);

    public abstract void delete(T obj);
}
