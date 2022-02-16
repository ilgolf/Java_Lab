package firstCollection;

import java.util.*;

/**
 * 동욱님의 예제를 빌려와 사용하고 있습니다.
 * 출처 - https://jojoldu.tistory.com/412
 */
public class LottoTicket {

    private static final int LOTTO_NUMBERS_SIZE = 6;

    private final List<Long> lottoNumbers;

    public LottoTicket(List<Long> lottoNumbers) {
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    private void validateDuplicate(List<Long> lottoNumbers) {
        Set<Long> checkNum = new HashSet<>(lottoNumbers);

        if (checkNum.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException("로또 번호는 중복될 수 없습니다.");
        }
    }

    private void validateSize(List<Long> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_NUMBERS_SIZE) {
            throw new IllegalArgumentException("로또 번호는 반드시 6개 입니다.");
        }
    }
}
