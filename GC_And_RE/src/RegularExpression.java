import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*정규 표현식은 문자열에서 특정 패턴을 찾아내기 위한 문자 조합이다.
		 *정규표현식은 다양한 문자와 메타 문자를 이용하여 특정 패턴을 표현한다.
		 *Pattern pattern = Pattern.compile("(#)(.*)");
				Matcher matcher = pattern.matcher(item.getSnippet().getDescription());
				String tag="";
				while (matcher.find()) { 
					if(!matcher.group(0).contains("】")) {
						if(matcher.group(0).contains(",")||matcher.group(0).contains(" ")) {
							for(String y : matcher.group(0).replace(",", "").replace(" ","").split("#"))
								if(!y.equals(""))
									tag+=y+";";
						}
						else {
							tag+=(matcher.group(0).replace("#", "").replace(" ", ""))+";";
						}
					}
					if(matcher.group(0) ==  null)
						break;
				}
				위의 코드는 필자의 프로젝트 중 하나인 AnyHolo의 서버에서 실행하는 코드이다.
				위 코드에서 (#)(.*)이 의미하는 것은
				#으로 시작하는 모든 글자를 찾겠다라는 것이다.
				코드의 대한 설명은 youtube api에서 영상 설명을 가져온 뒤
				정규 표현식을 매치시켜 원하는 값들만 가져온 뒤 그중 】이런 글자가 없는 것을 찾아 tag에 #없이 구분자;로 저장하는 것이다.
				
				
				정규 표현식이 필요한 이유는 다양한 형태의 문자열에서 원하는 데이터만을 뽑아내는 작업을 해야하기 때문이다.
				
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 */
		String input = "전화번호는 010-1234-5678입니다. 02-1234-5678";

        // 전화번호 패턴 설정
        Pattern pattern = Pattern.compile("\\d{2,3}-\\d{3,4}-\\d{4}");
        /*
         \d : 10진수 숫자
		 {} : 패턴 반속 횟수
		 - : 해당 문자를 뜻함
		 . : 모든 문자를 의미
		 ^ : 입력 문자열의 시작
		 $ : 입력 문자열의 끝
		 + : 앞 문자가 1번 이상 나타날 수 있음
		 ? : 앞 문자가 0번 또는 1번 나타날 수 있음
		 [] : 대괄호 안에 포함된 문자 중 하나가 나타날 수 있음
		 () : 그룹화를 나타내며, 괄호 안에 패턴을 하나의 문자처럼 취급함
		 | : OR조건
         * */

        // 패턴에 일치하는 문자열 찾기
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            System.out.println("전화번호: " + matcher.group());
        }
        //예제 코드
	}

}
