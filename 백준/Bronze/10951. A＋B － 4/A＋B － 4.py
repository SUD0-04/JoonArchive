while True:
    try:
        A, B = map(int, input().split())
        print(A + B)
    except EOFError:
        break  # 더 이상 입력값이 없을 때(파일 끝) 안전하게 종료하기 위함
