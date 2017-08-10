package sample.component;

import sample.annotation.SampleAnnotation;

/**
 * User: Michael.Patel
 * Date: 13/02/13
 * Time: 11:59
 */
public class SampleComponent {

      @SampleAnnotation
      public String interceptMe(String input){
                   return "has been input "+ input ;
      }

}
