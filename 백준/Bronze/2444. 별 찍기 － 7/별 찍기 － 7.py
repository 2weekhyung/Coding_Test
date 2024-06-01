def print_star_diamond(N):
    # 상단 피라미드 부분
    for i in range(1, N + 1):
        spaces = ' ' * (N - i)
        stars = '*' * (2 * i - 1)
        print(spaces + stars)
    
    # 하단 역 피라미드 부분
    for i in range(N - 1, 0, -1):
        spaces = ' ' * (N - i)
        stars = '*' * (2 * i - 1)
        print(spaces + stars)

# 입력값 받기
N = int(input().strip())

# 출력하기
print_star_diamond(N)
