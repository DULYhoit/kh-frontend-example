# 1. 배열 filter, map, reduce

## 1.1. filter
```javascript
filter(callbackfn [, ?thisArg])
```

callbackfn: 참, 거짓을 평가할 수 있는 함수가 넘어가면 됨

## 1.2.map

```javascript
filter(callbackfn)
```

callbackfn: 원소를 변환할 함수
## 1.3. reduce
```javascript
l = ['apple', 'grape' , 'orange']
l.map(x => x.length)
```

callbackfn
1. acc: 누산할 값
2. cur: 현재 값

# 2. DOM API

## 2.1. 요소(HTML element) 찾기

- id
- class
- 태그

### 2.1.1. id로 찾기

```javascript
document.getElementByID('')
```

### 2.1.2. class로 찾기

```javascript
document.getElemntsByClassName('클래스이름')// 클래스
document.querySelectorAll('클래스이름')// css랑 동일하
```

### 2.1.3. 태그 이름으로 찾기

```javascript
ocument.getElemntsByTagName('태그이름')
document.querySelectorAll('클래스이름')