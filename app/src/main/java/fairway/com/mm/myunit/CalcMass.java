package fairway.com.mm.myunit;

import java.text.DecimalFormat;

public class CalcMass {
    private double ywaylay = 0, ywaygyi = 0, petha = 0, mutha = 0,
            mattha = 0, ngamutha = 0, kyattha = 0, peittha = 0, mg = 0, g = 0, kg = 0, oz = 0, lb = 0;

    private void setMU(double ywaylay){
        this.ywaylay = ywaylay;
        ywaygyi = this.ywaylay / 2;
        petha = ywaygyi / 3.75;
        mutha = petha / 2;
        mattha = mutha / 2;
        ngamutha = mattha / 2;
        kyattha = ngamutha / 2;
        peittha = kyattha / 100;
    }

    private void setMetric(double mg){
        this.mg = mg;
        g = this.mg / 1000;
        kg = g / 1000;
    }

    private void setImperial(double oz){
        this.oz = oz;
        lb = oz / 16;
    }
//---------------------------------------------------------------------
    private void MUConvert(){
        setImperial(ywaylay * 0.0048); // output oz
        setMetric(ywaylay * 0.136);
    }
    private void MetricConvert(){
        setImperial(mg * 0.000035);
        setMU(mg * 0.007348);
    }
    private void ImperialConvert(){
        setMU(oz * 208.333);
        setMetric(oz * 28349.4);
    }
//---------------------------------------------------------------------


    public String getYwaylay() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ywaylay);
    }

    public void setYwaylay(double ywaylay) {
        setMU(ywaylay);
        MUConvert();
    }

    public String getYwaygyi() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ywaygyi);
    }

    public void setYwaygyi(double ywaygyi) {
        setMU(ywaylay * 2);
        MUConvert();
    }

    public String getPetha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(petha);
    }

    public void setPetha(double petha) {
        setMU(ywaygyi * 3.75);
        MUConvert();
    }

    public String getMutha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mutha);
    }

    public void setMutha(double mutha) {
        setMU(petha * 2);
        MUConvert();
    }

    public String getMattha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mattha);
    }

    public void setMattha(double mattha) {
        setMU(mutha * 2);
        MUConvert();
    }

    public String getNgamutha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ngamutha);
    }

    public void setNgamutha(double ngamutha) {
        setMU(mattha * 2);
        MUConvert();
    }

    public String getKyattha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(kyattha);
    }

    public void setKyattha(double kyattha) {
        setMU(ywaylay * 120);
        MUConvert();
    }

    public String getPeittha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(peittha);
    }

    public void setPeittha(double peittha) {
        setMU(kyattha * 100);
        MUConvert();
    }

    public String getMg() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mg);
    }

    public void setMg(double mg) {
        setMetric(mg);
        MetricConvert();
    }

    public String getG() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(g);
    }

    public void setG(double g) {
        setMetric(mg * 1000);
        MetricConvert();
    }

    public String getKg() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(kg);
    }

    public void setKg(double kg) {
        setMetric(g * 1000);
        MetricConvert();
    }

    public String getOz() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(oz);
    }

    public void setOz(double oz) {
        setImperial(oz);
        ImperialConvert();
    }

    public String getLb() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(lb);
    }

    public void setLb(double lb) {
        setImperial(oz * 16);
        ImperialConvert();
    }
}
