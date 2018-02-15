package exercise1;

class LUASJourney extends Journey implements Runnable {

    private double totalJourneyTime;

    public LUASJourney(double[] journeyData) {
        super(journeyData);
    }

    @Override
    public void run() {

        for (int b = 0; b < timeInterval.length; b++) {
            totalJourneyTime += timeInterval[b];
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted while busy sleeping...");
        }
        System.out.println("Total Journey Time: " + getTotalJourneyTime());
    }

    public double getTotalJourneyTime() {
        return totalJourneyTime;
    }

}
