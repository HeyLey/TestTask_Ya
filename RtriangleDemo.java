class RtriangleDemo implements Rtriangle {
    public static int[] array;
    int x1, y1, x2, y2, x3, y3;

    public RtriangleDemo(int[] array) {
        x1 = array[0];
        y1 = array[1];
        x2 = array[2];
        y2 = array[3];
        x3 = array[4];
        y3 = array[5];
    }

    @Override
    public int getApexX1() {
        return x1;
    }
    @Override
    public int getApexY1() {
        return y1;
    }
    @Override
    public int getApexX2() {
        return x2;
    }
    @Override
    public int getApexY2() {
        return y2;
    }
    @Override
    public int getApexX3() {
        return x3;
    }
    @Override
    public int getApexY3() {
        return y3;
    }

  /*  public RtriangleDemo(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }    */
}


