package clase;

public abstract class Template {
    protected abstract void curataMasa();
    protected abstract void puneServetele();
    protected abstract void puneTacamuri();
    protected abstract void aseazaPersoaneLaMasa();

    public final void OcupaMasa()
    {
        curataMasa();
        puneServetele();
        puneTacamuri();
        aseazaPersoaneLaMasa();
    }

}
