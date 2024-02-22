class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    
    double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
   
    double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    
    double getRateOfInterest() {
        return 9.7;
    }
}

public class bankintrest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("Rate of Interest in SBI: " + sbi.getRateOfInterest());
        System.out.println("Rate of Interest in ICICI: " + icici.getRateOfInterest());
        System.out.println("Rate of Interest in AXIS: " + axis.getRateOfInterest());
    }
}
