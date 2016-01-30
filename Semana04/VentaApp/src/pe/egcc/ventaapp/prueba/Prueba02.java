package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 29/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {
    CompAbstract comp = CompFactory.crearComp(CompFactory.COMP_BOLETA);
    ItemDto[] repo = comp.procesar(890.00);
    for (ItemDto bean : repo) {
      System.out.println(bean.getConcepto() + " ===>> " + bean.getValor());
    }
  }

}
