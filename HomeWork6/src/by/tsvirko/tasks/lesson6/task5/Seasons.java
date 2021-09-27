package by.tsvirko.tasks.lesson6.task5;

public enum Seasons {
    WINTER(-10), SPRING(15) {
        @Override
        public String getDescription() {
            return "Потеплее время года.";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года.";
        }
    },
    AUTUMN(10) {
        @Override
        public String getDescription() {
            return "Попрохладнее время года.";
        }
    };

    private int avgTemp;

    Seasons() {
    }

    Seasons(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года.";
    }
}
