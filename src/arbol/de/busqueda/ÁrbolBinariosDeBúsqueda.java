/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.de.busqueda;

import java.util.Random;

/**
 *
 * @author AleMor
 */
public class ÁrbolBinariosDeBúsqueda {

    /**
     * @param args the command line arguments
     */
    class Nodo
      {
        int info;
        Nodo izq, der;
      }
      Nodo raiz;

      public ÁrbolBinariosDeBúsqueda() {
          raiz=null;
      }
      
      public void insertar (int info)
      {
          Nodo nuevo;
          nuevo = new Nodo ();
          nuevo.info = info;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null)
              raiz = nuevo;
          else
          {
              Nodo anterior = null, reco;
              reco = raiz;
              while (reco != null)
              {
                  anterior = reco;
                  if (info < reco.info)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (info < anterior.info)
                  anterior.izq = nuevo;
              else
                  anterior.der = nuevo;
          }
      }


      private void printPre (Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.info + "\n ");
              printPre (reco.izq);
              printPre (reco.der);
          }
      }

      public void printPre ()
      {
          printPre (raiz);
          System.out.println();
      }

      private void printEntre (Nodo reco)
      {
          if (reco != null)
          {    
              printEntre (reco.izq);
              System.out.print(reco.info + "\n ");
              printEntre (reco.der);
          }
      }

      public void printEntre ()
      {
          printEntre (raiz);
          System.out.println();
      }


      private void printPost (Nodo reco)
      {
          if (reco != null)
          {
              printPost (reco.izq);
              printPost (reco.der);
              System.out.print(reco.info + "\n");
          }
      }


      public void printPost ()
      {
          printPost (raiz);
          System.out.println();
      }

    public static void main(String[] args) {
        // TODO code application logic here
         ÁrbolBinariosDeBúsqueda abo = new ÁrbolBinariosDeBúsqueda ();
          /*abo.insertar (100);
          abo.insertar (50);
          abo.insertar (25);
          abo.insertar (75);
          abo.insertar (150);*/
          for(int r=0; r<=999999; r++){
                    Random aleatorio = new Random();
                     int cadena=aleatorio.nextInt();
                     abo.insertar(cadena);
          }
                     
          System.out.println ("PREORDEN: ");
          abo.printPre ();
          System.out.println ("ENORDEN: ");
          abo.printEntre ();
          System.out.println ("POSTORDEN: ");
          abo.printPost ();        
      }
        
    }
    

