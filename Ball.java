public class Ball {
    double BallRad;
    double BallPosx;
    double BallPosy;
    double DeltaxAdjust;
    double DeltayAdjust;
    public double Deltax = 5;
    public double Deltay = 3;
    

    public Ball(double BallRad, double BallPosx, double BallPosy, double DeltaxAdjust, double DeltayAdjust) {
        this.BallRad= BallRad;
        this.BallPosx = BallPosx;
        this.BallPosy = BallPosy;
        this.DeltaxAdjust = DeltaxAdjust;
        this.DeltayAdjust = DeltayAdjust;
    }

    public void PosSetter() {

    }

    public void ReflectXMovement() {
        this.Deltax = -Deltax;
    }

    public void ReflectYMovement() {
        this.Deltay = -Deltay;
    }

    public void AdjustMovement() {
        Deltax = Deltax + DeltaxAdjust * (0.1);
        Deltay = Deltay + DeltayAdjust * (0.1);
    }

    public void MoveBall() {
        BallPosx = BallPosx + Deltax;
        BallPosy = BallPosy + Deltay;
    }

    public void PosGetter() {
        System.out.println("Ball(" + BallPosx + "," + BallPosy + ")");
    }

    public void DimensionReturner() {
        double Circumference = (2) *  Math.PI * (BallRad);
        System.out.println("The Circumference is: " + Circumference);
        double Volume = Math.PI * Math.pow(BallRad, 3) * 4/3;
        System.out.println("The Volume is: " + Volume);
    }

    public static void main(String[]args) {
        Ball Ball1 = new Ball(3, 2, 2, 2, 3);
        Ball1.AdjustMovement();
        Ball1.MoveBall();
        Ball1.PosGetter();
        Ball1.DimensionReturner();
    }

}

