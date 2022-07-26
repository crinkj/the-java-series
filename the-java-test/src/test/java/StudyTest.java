import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class) // 테스트 실행시 메소드 이름 _제거하고 출력
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 \uD83D\uDE31") // 추천 -> 한글로도 작성되고 자유롭게 표현이 가능
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    /**
     * JUnit 5에서 새로 나온 어노테이션
     */

    @Test
    @Disabled // @disabled -> 실행을 시키지 않는다.
    void create1(){
        System.out.println("create1");
    }

    /**
     * 모든 테스트가 실행되기전에 딱 한번만 호출만 된다.
     * 해당 어노테이션 method는 static void 로 사용해야함.
     */
    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    /**
     * 모든 테스트를 실행할때 각각의 테스트를 실행하기 전과후로 호출된다.
     */
    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }

}