# 입력을 받을 표준 입력을 열어줍니다
import sys
input = sys.stdin.readline

# 입력이 끝날 때까지 계속 입력을 받고 처리합니다
while True:
    # 한 줄을 읽어들입니다
    line = input().strip()
    
    # 입력이 없으면 반복문을 종료합니다
    if not line:
        break
    
    # 입력된 문자열을 공백을 기준으로 분리하여 정수로 변환합니다
    A, B = map(int, line.split())
    
    # 합을 출력합니다
    print(A + B)
