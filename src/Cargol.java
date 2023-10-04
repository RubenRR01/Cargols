public class Cargol implements Runnable{

        private int id;
        private int metros;

    public int getId() {
        return id;
    }

    public int getMetros() {
        return metros;
    }

    public Cargol(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            metros ++;
        }

        @Override
        public String toString() {
            return "Cargol " + id + " ha recorregut " + metros + "metros totals";
        }
}


