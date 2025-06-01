class GStack<T> {
    int tos;
    T[] stck;

    @SuppressWarnings("unchecked")
    public GStack() {
        tos = 0;
        stck = (T[]) new Object[10]; // 타입 안정성을 위한 캐스팅
    }

    public void push(T item) {
        if (tos == stck.length) // 하드코딩된 크기 제거
            return;
        stck[tos] = item;
        tos++;
    }

    public T pop() {
        if (tos == 0)
            return null;
        tos--;
        return stck[tos];
    }
}

public class MyStack {
    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<>();
        stringStack.push("Seoul");
        stringStack.push("Busan");
        stringStack.push("LA");

        for (int n = 0; n < 3; n++)
            System.out.println(stringStack.pop());

        GStack<Integer> intStack = new GStack<>();
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for (int n = 0; n < 3; n++)
            System.out.println(intStack.pop());
    }
}