---
layout: home
permalink: /
title: <b>Hello, Survivors!</b>
description: (Modifying...)
---

### Topics

#### [Design Pattern]()

##### 2021.01.11 - Present

#### [Group Study Topic 2]()

##### 2020.11.12 - 2021.01.01

#### [Group Study Topic 1]()

##### 2019.01.11 - 2020.10.11


### Members

- [Member1](https://member.github.com) : personal website
- [Member2](https://member.github.com) : personal website
- [Member3](https://member.github.com) : personal website
- [Member4](https://member.github.com) : personal website

### Rules

1. 개인 포스트
    - 반드시 첫번째 태그로 작성자의 **깃헙 계정**을 입력해주세요.
    - 양식은 상관없으나, 지나친 메모 용도로는 사용하지 말아주세요.
    - (무료로 제공되는 용량이 최대 500MB 입니다..)
2. 그룹 포스트
    - 스터디 용도로 작성되는 글이며, 타인이 이해할 수 있는 형태로 작성해주세요.
    - 반드시 첫번째와 두번째 태그로 **스터디 주제**와 작성자의 **깃헙 계정**을 입력해주세요
3. 포스트 작성
    - 마크다운 파일이 표현되는 방식은 [여기]()를 참고해주세요.
    - `_posts/GITHUB_ID/YYYY-MM-DD-title.md` 경로로 파일을 작성해주세요.
    - 파일 이름의 title 에는 무엇이 들어가든 상관없으나, 아무것도 없으면 포스트가 생성되지 않습니다.
    - 새로운 태그를 추가하시려면, 마크다운 파일 작성 후 `_data/tags.yml`에 양식에 맞게 새 태그를 추가하고, `tag_generator.py` 파일을 실행한 뒤 Pull Request 해주세요.
    - 마크다운 안에서 상단에 다음과 같은 형식을 반드시 지켜주세요.

{% highlight terminal %}
---
layout: post
title: <포스트 제목>
comments: true
tags: <태그> <태그>
---
{% endhighlight %}


### (Maybe) Coming Soon

- 태그 관련해서는 포스트가 많아지면 그룹핑을 다시해야 될 것 같습니다만, 차후에 고민하면 될 듯 합니다. 여기서 태그는 카테고리 역할을 하지만, 개인이 쓴 글을 분류하는 개인 페이지의 역할도 수행합니다.
- 추가로, 서로 댓글을 쓸 수 있도록 디스커스를 추가할 생각도 있는데 이것도 나중에 ^.^..
- Jekyll 의 디렉토리 구조가 궁금하시다면, [여기](https://jekyllrb-ko.github.io/docs/structure/)를 참고하시면 됩니다.

