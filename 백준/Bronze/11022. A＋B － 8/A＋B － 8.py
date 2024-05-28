# 입력을 받을 표준 입력을 열어줍니다
import sys
input = sys.stdin.read

# 표준 입력을 전체를 읽어서 여러 줄의 입력으로 나누어줍니다
data = input().splitlines()

# 첫째 줄에는 테스트 케이스의 개수가 주어집니다
T = int(data[0])

# 각 테스트 케이스마다 두 정수를 읽고 결과를 출력합니다
for i in range(1, T + 1):
    A, B = map(int, data[i].split())
    C = A + B
    print(f"Case #{i}: {A} + {B} = {C}")
