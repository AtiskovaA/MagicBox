# MagicBox
Реализовано

1. Класс MagicBox (англ. магическая коробка), 
который умеет выбирать случайным образом один из сохранённых в него объектов.

2. Создан метод добавления объекта boolean add(T item). 
Если коробка ещё не полна, то элемент в ней сохранится и метод вернет true.
Если полна, то коробка не изменяется, а метод возвращает false.

3. Реализован метод T pick(), работающий так:
Если коробка не полна, то он выкидывает RuntimeException с сообщением, что коробка не полна и осталось ещё столько-то ячеек заполнить
Если коробка полна, то метод выбирает случайным образом один из сохранённых элементов и возвращает его из метода.


