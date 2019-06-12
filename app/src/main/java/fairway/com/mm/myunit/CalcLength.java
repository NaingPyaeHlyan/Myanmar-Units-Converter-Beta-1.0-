package fairway.com.mm.myunit;

import java.text.DecimalFormat;

public class CalcLength {
    private double sanchi = 0, hnan = 0, mayaw = 0, letthit = 0, maik = 0, htwa = 0, taung = 0, lan = 0, ta = 0,
            outhaba = 0, kawtha = 0, gawout = 0, yuzana = 0, mm = 0, cm = 0, m = 0, km = 0, in = 0, ft = 0, yard = 0, mile = 0;

    private void setMU(double htwa){
        this.htwa = htwa;
        maik = this.htwa * 1.5;
        letthit = maik * 8;
        mayaw = letthit * 4;
        hnan = mayaw * 6;
        sanchi = hnan * 10;
        taung = this.htwa / 2;
        lan = taung / 4;
        ta = lan / 1.75;
        outhaba = ta / 20;
        kawtha = outhaba / 20;
        gawout = kawtha / 4;
        yuzana = gawout / 4;
    }

    private void setMetric(double mm){
        this.mm = mm;
        cm = this.mm / 10;
        m = cm / 100;
        km = m / 1000;
    }

    private void setImperial(double in){
        this.in = in;
        ft = this.in / 12;
        yard = ft / 3;
        mile = yard / 1760;
    }
//---------------------------------------------------------------------
    private void MUConvert(){
        setImperial(htwa * 9);
        setMetric(htwa * 22.86);
    }
    private void MetricConvert(){
        setImperial(25.4 * mm);
        setMU(mm / 228.6);
    }
    private void ImperialConvert(){
        setMetric(ft * 30.48);
        setMU(in / 9);
    }
//---------------------------------------------------------------------

    public String getSanchi() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(sanchi);
    }

    public void setSanchi(double sanchi) {
        setMU(sanchi / 2880);
        MUConvert();
    }

    public String getHnan() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(hnan);
    }

    public void setHnan(double hnan) {
        setMU(hnan / 288);
        MUConvert();
    }

    public String getMayaw() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mayaw);
    }

    public void setMayaw(double mayaw) {
        setMU(mayaw / 48);
        MUConvert();
    }

    public String getLetthit() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(letthit);
    }

    public void setLetthit(double letthit) {
        setMU(letthit / 12);
        MUConvert();
    }

    public String getMaik() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(maik);
    }

    public void setMaik(double maik) {
        setMU(maik / 1.5);
        MUConvert();
    }

    public String getHtwa() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(htwa);
    }

    public void setHtwa(double htwa) {
        setMU(htwa);
        MUConvert();
    }

    public String getTaung() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(taung);
    }

    public void setTaung(double taung) {
        setMU(taung * 2);
        MUConvert();
    }

    public String getLan() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(lan);
    }

    public void setLan(double lan) {
        setMU(lan * 8);
        MUConvert();
    }

    public String getTa() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ta);
    }

    public void setTa(double ta) {
        setMU(ta * 8);
        MUConvert();
    }

    public String getOuthaba() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(outhaba);
    }

    public void setOuthaba(double outhaba) {
        setMU(outhaba * 280);
        MUConvert();
    }

    public String getKawtha() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(kawtha);
    }

    public void setKawtha(double kawtha) {
        setMU(kawtha * 5600);
        MUConvert();
    }

    public String getGawout() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(gawout);
    }

    public void setGawout(double gawout) {
        setMU(gawout * 5600 * 4);
        MUConvert();
    }

    public String getYuzana() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(yuzana);
    }

    public void setYuzana(double yuzana) {
        setMU(yuzana *  22400 * 4);
        MUConvert();
    }

    public String getMm() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mm);
    }

    public void setMm(double mm) {
        setMetric(mm);
        MetricConvert();
    }

    public String getCm() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(cm);
    }

    public void setCm(double cm) {
        setMetric(cm * 10);
        MetricConvert();
    }

    public String getM() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(m);
    }

    public void setM(double m) {
        setMetric(m * 1000);
        MetricConvert();
    }

    public String getKm() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(km);
    }

    public void setKm(double km) {
        setMetric(km * 1000000);
        MetricConvert();
    }

    public String getIn() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(in);
    }

    public void setIn(double in) {
        setImperial(in);
        ImperialConvert();
    }

    public String getFt() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(ft);
    }

    public void setFt(double ft) {
        setImperial(ft * 12);
        ImperialConvert();
    }

    public String getYard() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(yard);
    }

    public void setYard(double yard) {
        setImperial(yard * 3 * 12);
        ImperialConvert();
    }

    public String getMile() {
        DecimalFormat df = new DecimalFormat(".000000");
        return df.format(mile);
    }

    public void setMile(double mile) {
        setImperial(mile * 63360);
        ImperialConvert();
    }


//---------------------------------------------------------------------
}
