package model.dao;

import model.dao.impl.SellerDaoJDBC;

//Classe com operações estáticas para instanciar os DAOs
public class DaoFactory {

    //A classe DaoFactory expõe um metodo que retorna o tipo da interface, mas internamente ela instancia uma implementação;
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
