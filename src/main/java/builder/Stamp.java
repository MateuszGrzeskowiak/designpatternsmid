package builder;

public class Stamp {
    int firstDayNumber,
            secondDayNumber,
            firstMonthNumber,
            secondMonthNumber,
            yearNumber1,
            yearNumber2,
            yearNumber3,
            yearNumber4,
            caseNumber;

    public Stamp(int firstDayNumber, int secondDayNumber, int firstMonthNumber, int secondMonthNumber, int yearNumber1, int yearNumber2, int yearNumber3, int yearNumber4, int caseNumber) {
        this.firstDayNumber = firstDayNumber;
        this.secondDayNumber = secondDayNumber;
        this.firstMonthNumber = firstMonthNumber;
        this.secondMonthNumber = secondMonthNumber;
        this.yearNumber1 = yearNumber1;
        this.yearNumber2 = yearNumber2;
        this.yearNumber3 = yearNumber3;
        this.yearNumber4 = yearNumber4;
        this.caseNumber = caseNumber;
    }
    public static class StampBuilder{

        private int firstDayNumber;
        private int secondDayNumber;
        private int firstMonthNumber;
        private int secondMonthNumber;
        private int yearNumber1;
        private int yearNumber2;
        private int yearNumber3;
        private int yearNumber4;
        private int caseNumber;

        public StampBuilder setFirstDayNumber(int firstDayNumber) {
            this.firstDayNumber = firstDayNumber;
            return this;
        }

        public StampBuilder setSecondDayNumber(int secondDayNumber) {
            this.secondDayNumber = secondDayNumber;
            return this;
        }

        public StampBuilder setFirstMonthNumber(int firstMonthNumber) {
            this.firstMonthNumber = firstMonthNumber;
            return this;
        }

        public StampBuilder setSecondMonthNumber(int secondMonthNumber) {
            this.secondMonthNumber = secondMonthNumber;
            return this;
        }

        public StampBuilder setYearNumber1(int yearNumber1) {
            this.yearNumber1 = yearNumber1;
            return this;
        }

        public StampBuilder setYearNumber2(int yearNumber2) {
            this.yearNumber2 = yearNumber2;
            return this;
        }

        public StampBuilder setYearNumber3(int yearNumber3) {
            this.yearNumber3 = yearNumber3;
            return this;
        }

        public StampBuilder setYearNumber4(int yearNumber4) {
            this.yearNumber4 = yearNumber4;
            return this;
        }

        public StampBuilder setCaseNumber(int caseNumber) {
            this.caseNumber = caseNumber;
            return this;
        }

        public Stamp createStamp() {
            return new Stamp(firstDayNumber, secondDayNumber, firstMonthNumber, secondMonthNumber, yearNumber1, yearNumber2, yearNumber3, yearNumber4, caseNumber);
        }
    }
}
