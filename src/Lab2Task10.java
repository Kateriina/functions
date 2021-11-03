public class Lab2Task10 extends Lab2Task8 {

        double real2;
        double imag2;

        public Lab2Task10(){}

        public Lab2Task10(double real, double imag, double real2, double imag2){

                super(real, imag);

                this.real2 = real2;
                this.imag2 = imag2;
        }

        public void mult(double a1, double b1, double a2, double b2){

                Lab2Task10 z = new Lab2Task10();

                z.real2 = (a1 * a2 - b1 * b2) ;
                z.imag2 = (a1*b2 + a2 * b1);

                System.out.printf("Произведение двух комплексных чисел: %.2f%s%.2fi \n\n", z.real2, (z.imag2 > 0)?" + ":"", z.imag2);
        }
}
