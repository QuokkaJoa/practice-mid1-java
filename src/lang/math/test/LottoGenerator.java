package lang.math.test;

import java.util.Random;

public class LottoGenerator {

  private int[] lottoNumbers;
  private final Random randomNumbers = new Random();
  private int count;

  public int[] generate(){
    lottoNumbers = new int[6];
    while (count < 6) {
      int number = randomNumbers.nextInt(45) + 1;
      if (isUnique(number)) {
        lottoNumbers[count] = number;
        count++;
      }
    }
    return lottoNumbers;
  }

  private boolean isUnique(int number) {
    for (int lottoNumber : lottoNumbers) {
      if (lottoNumber == number) {
        return false;
      }
    }
    return true;
  }
}
