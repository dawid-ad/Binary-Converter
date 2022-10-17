package pl.dawidad;

public class Converting implements ConvertMethods {
    @Override
    public String DecimalToBinary(int n){
        StringBuilder converted = new StringBuilder();

        while (n >= 1) {
            if (n%2 == 0){
                converted.append("0");
            } else {
                converted.append("1");
            }
            n = n/2;
        }
        converted.reverse();
        return converted.toString();
    }

    @Override
    public int BinaryToDecimal(String binnary) {
        StringBuilder binnaryBuilder = new StringBuilder(binnary);
        binnaryBuilder.reverse();
        int result = 0;
        for (int i = 0; i < binnaryBuilder.length(); i++) {
            if(!(binnaryBuilder.charAt(i) == '1' || binnaryBuilder.charAt(i) == '0')) {
                return 0;
            } else {
                result += (Math.pow(2, i) * Integer.parseInt(String.valueOf(binnaryBuilder.charAt(i))));
            }
        }
        return result;
    }
}
