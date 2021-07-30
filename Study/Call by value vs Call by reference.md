## Call by value vs Call by reference
두 가지 모두 메소드(함수) 호출 방식

### 1. Call by value
> 값에 의한 호출
* call by value 호출 방식은 함수 호출 시 전달되는 변수 값을 복사해서 함수에 인자로 전달합니다.
* 이때 복사된 인자는 local value 속성을 가지므로 함수 내부에서 인자 값이 변경되더라도, 외부의 변수 값은 변경이 되지 않습니다.

### 2. Call by reference
> 참조에 의한 호출
* call by reference 호출 방식은 함수 호출 시 인자로 전달되는 변수의 레퍼런스를 전달합니다.
* 따라서 함수 안에서 인자 값이 변경되면, 전달인자(argument) 전달된 객체의 값도 변경됩니다.

### 3. 자바의 참조형은 Call by reference 인가?
* 자바에서 메소드의 호출 방식의 기본형은 call by value가 맞지만, call by reference같은 경우 전달된 인자의 원본 자체를 변경할 수는 없습니다.
* C/C++에서는 변수를 생성할 때마다 새로운 메모리 공간을 할당하고, 포인터를 사용한다면 같은 주소값을 가리킬 수 있도록 할 수 있습니다.
* 그러므로 주소값 자체를 인자로 넘겨주고 값을 변경하면 새로운 값으로 덮어 쓰여 기존의 값이 변경될 수 있는 것입니다.
* 즉, 자바에서는 원본값의 주소를 넘겨 주소값에 저장되어 있는 값을 변경하는 것으로 call by value라고 할 수 있습니다.

[참조] https://github.com/gyoogle/tech-interview-for-developer/blob/master/Language/%5Bjava%5D%20Call%20by%20value%EC%99%80%20Call%20by%20reference.md'


