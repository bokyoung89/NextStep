public class StringCalculator {
    int add(String text){
        if(isBlank(text)){
            return 0;
        }
        return sum(split(text));
    }

    private boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private String[] split(String text) {
        String[] values = text.split(",");
        return values;
    }

    private int sum(String[] values) {
        int sum = 0;
        for (String value: values) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
