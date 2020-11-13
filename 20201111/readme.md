# 1. 색상 표현 방법

## 1.1. 16진수

RGB

R: 0~255(0~ff)
G: 0~255(0~ff)
B: 0~255(0~ff)

ex)#d23232
R: D2h - 210
G: 32h - 50
B: 32h - 50

## 1.2. rgb 함수

rgb(r값, g값, b값)
rgba(r값, g값, b값, a값)
- a(alpha, 투명도): 0 ~ 1 사이의 값

## 1.3. HSL

HUE(색도): 0 ~ 360도
Saturation(채도): 0 ~ 100%
Lightness(명도): 0 ~ 100%

hsl(360, 100,100);
hsla(360, 100, 100);


# 2. gradation

liner-gradient([각도 혹은 방향], 정지점)

# 3. 박스를 구성하는 4가지

- margin: border(테두리) 바깥의 여백
- border: 테두리
- padding:
- content: