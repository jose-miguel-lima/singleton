public class ParametrosCoordenadas {
    private ParametrosCoordenadas() {};
    private static ParametrosCoordenadas instance = new ParametrosCoordenadas();
    public static ParametrosCoordenadas getInstance() {
        return instance;
    }

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}