package com.jdbc;

public class main {
   public static void main(String[] args) {
	
	    BussnessLogicLayer bussnessLogicLayer=new BussnessLogicLayer();
	   bussnessLogicLayer.SelectData();
//     bussnessLogicLayer.insertData(2, "neha", 102, 87);
//     bussnessLogicLayer.SelectData();
  //   bussnessLogicLayer.UpdateData(2, "Kumar");
 // bussnessLogicLayer.SelectData();
	   
	   bussnessLogicLayer.DeleteData(2);
	   bussnessLogicLayer.SelectData();
   }
}
