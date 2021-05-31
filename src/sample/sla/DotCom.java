package sample.sla;

import java.io.File;
import java.util.Scanner;

class DotCom extends Business{
    private String HQLocation;
    private double MarketCap;
    private int FoundingYear;
    private int FiscalYear;

    public DotCom(int rank, String name, double revenue, int employeeCt, String HQLocation, double marketCap, int foundingYear) {
        super(rank, name, revenue, employeeCt);
        this.HQLocation = HQLocation;
        MarketCap = marketCap;
        FoundingYear = foundingYear;
    }

    String getHQLocation() {
        return HQLocation;
    }

    void setHQLocation(String HQLocation) {
        this.HQLocation = HQLocation;
    }

    double getMarketCap() {
        return MarketCap;
    }

    void setMarketCap(float marketCap) {
        MarketCap = marketCap;
    }

    int getFoundingYear() {
        return FoundingYear;
    }

    void setFoundingYear(int foundingYear) {
        FoundingYear = foundingYear;
    }

    int getFiscalYear() {
        return FiscalYear;
    }

    void setFiscalYear(int fiscalYear) {
        FiscalYear = fiscalYear;
    }

    public String toString() {
        String desc = "";
        desc += "Company: " + this.getName() + ", " + this.getHQLocation() + ", " + this.getFoundingYear();
        return desc;
    }

    static void read(String datafilePath) {
        File file = new File(datafilePath);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Can't open " + datafilePath);
        }

        while (scanner.hasNextLine()) {
            String next = scanner.nextLine();
            Scanner lineScanner = new Scanner(next);
            lineScanner.useDelimiter("\t");

            int rank = lineScanner.nextInt();

            String name = lineScanner.next();

            float revenue = lineScanner.nextFloat();

            int FY = lineScanner.nextInt();

            int employeeCt = lineScanner.nextInt();

            float marketCap;
            String mCap = lineScanner.next();
            if (mCap.contains("-")) {
                marketCap = 0;
            }
            else marketCap = Float.parseFloat(mCap);

            String HQLocation = lineScanner.next();

            int foundingYear = lineScanner.nextInt();

            new DotCom(rank, name, revenue, employeeCt, HQLocation, marketCap, foundingYear);
        }

    }
}
