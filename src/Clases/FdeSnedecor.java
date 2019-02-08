
package Clases;
import java.lang.Math;

public class FdeSnedecor {
    private double pValor;

    public double getpValor() {
        return pValor;
    }

    public FdeSnedecor(double x, double glN, double glD) {
        pValor=FishF(x, glN, glD);
    }
    
   
    
//   public double gamma(double x){
//		return Math.sqrt(2*Math.PI/x)*Math.pow((x/Math.E), x);
//	}
 
//	public double gamma(double x){
//		double[] p = {0.99999999999980993, 676.5203681218851, -1259.1392167224028,
//			     	  771.32342877765313, -176.61502916214059, 12.507343278686905,
//			     	  -0.13857109526572012, 9.9843695780195716e-6, 1.5056327351493116e-7};
//		int g = 7;
//		if(x < 0.5) return Math.PI / (Math.sin(Math.PI * x)*gamma(1-x));
// 
//		x -= 1;
//		double a = p[0];
//		double t = x+g+0.5;
//		for(int i = 1; i < p.length; i++){
//			a += p[i]/(x+i);
//		}
// 
//		return Math.sqrt(2*Math.PI)*Math.pow(t, x+0.5)*Math.exp(-t)*a;
//	}
// 
//        public double betta(double x, double y){
//            return (gamma(x)*gamma(y))/gamma(x+y);
//        }
        
//  static double logGamma(double x) {
//      double tmp = (x - 0.5) * Math.log(x + 4.5) - (x + 4.5);
//      double ser = 1.0 + 76.18009173    / (x + 0)   - 86.50532033    / (x + 1)
//                       + 24.01409822    / (x + 2)   -  1.231739516   / (x + 3)
//                       +  0.00120858003 / (x + 4)   -  0.00000536382 / (x + 5);
//      return tmp + Math.log(ser * Math.sqrt(2 * Math.PI));
//   }
//   
//  static double gamma(double x) { return Math.exp(logGamma(x)); }

public double StatCom(double q,double i,double j,double b) {
    double zz=1; 
    double z=zz; 
    double k=i; 
    while(k<=j) 
    { zz=zz*q*k/(k-b); z=z+zz; k=k+2 ;}
    return z;
    }


public double FishF(double f, double n1,double n2) {
    double PiD2=Math.PI/2;
    double x=n2/(n1*f+n2);
    if((n1%2)==0) { return StatCom(1-x,n2,n1+n2-4,n2-2)*Math.pow(x,n2/2) ;}
    if((n2%2)==0){ return 1-StatCom(x,n1,n1+n2-4,n1-2)*Math.pow(1-x,n1/2) ;}
    double th=Math.atan(Math.sqrt(n1*f/n2)); 
    double a=th/PiD2;
    double sth=Math.sin(th); 
    double cth=Math.cos(th);
    if(n2>1) { a=a+sth*cth*StatCom(cth*cth,2,n2-3,-1)/PiD2 ;}
    if(n1==1) { return 1-a ;}
    double c=4*StatCom(sth*sth,n2+1,n1+n2-4,n2-2)*sth*Math.pow(cth,n2)/Math.PI;
    if(n2==1) { return 1-a+c/2 ;}
    double k=2; while(k<=(n2-1)/2) {c=c*k/(k-.5); k=k+1 ;}
    return 1-a+c;
    }

}