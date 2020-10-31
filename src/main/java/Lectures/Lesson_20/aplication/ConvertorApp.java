package Lectures.Lesson_20.aplication;

public class ConvertorApp {
    private int fuelConsumptionPer100Km = 12;

    public float convert(ConvertorTypes type, int convertedValue){
        float result = 0;
        if(convertedValue < 0){
            throw new IllegalArgumentException("value less then 0 not permitted");
        }

        switch (type){
            case FROM_KILLOGRAMM_TO_GRAMM:
                result = convertedValue * 1000;
                break;
            case FROM_METERS_TO_KILOMETERS:
                result = convertedValue/1000;
                break;
            case FROM_KM_TO_L:
                result = convertedValue * fuelConsumptionPer100Km / 100;
                break;
        }
        return result;
    }

    public enum ConvertorTypes {
        FROM_METERS_TO_KILOMETERS,
        FROM_KILLOGRAMM_TO_GRAMM,
        FROM_KM_TO_L;
    }
}
