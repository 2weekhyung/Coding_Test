#include <stdio.h>
#include <string.h>

int main() {
    char word[101]; // 단어의 최대 길이가 100이므로 101로 배열 크기를 설정
    scanf("%s", word); // 단어를 입력받음

    int length = strlen(word); // 단어의 길이
    int isPalindrome = 1; // 초기값을 팰린드롬인 것으로 설정

    // 문자열의 앞과 뒤를 비교
    for (int i = 0; i < length / 2; i++) {
        if (word[i] != word[length - 1 - i]) {
            isPalindrome = 0; // 앞과 뒤의 문자가 다르면 팰린드롬이 아님
            break;
        }
    }

    // 결과 출력
    if (isPalindrome) {
        printf("1\n"); // 팰린드롬이면 1을 출력
    } else {
        printf("0\n"); // 팰린드롬이 아니면 0을 출력
    }

    return 0;
}
