package ch09_Generic.GptPractice;

//임시저장소(좀 빠른 임시저장소)
//일반RDMS는 좀 느린데,응답성능이 한 10ms
//캐시 저장소는, 응답성능이 한 1ms
public class Cache<T> {

    private T data;
    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }
}
