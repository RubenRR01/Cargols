public class MonitorCargol implements Runnable{
    private Cargol cargol;

    public MonitorCargol(Cargol cargol) {
        this.cargol = cargol;
    }

    @Override
    public void run() {
        System.out.printf("%d porta %d netres acumulats%n",cargol.getId(),cargol.getMetros());
    }
}
