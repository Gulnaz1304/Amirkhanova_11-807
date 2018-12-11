# Задача

Написать приложение для поиска текстов, релевантных запросу.  
1. Реализовать компоненты, считающие коэффициент схожести между двумя текстами.
2. Использовать написанные компоненты для оценки соответствия ресурса данному поисковому запросу.  

Требования к реализации:
* Приложение должно поддерживать ввод текста из консоли и из текстового файла
* Приложение должно поддерживать вычисление коэффициента схожести двумя способами:
    * [Коэффициент Жаккара](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D1%8D%D1%84%D1%84%D0%B8%D1%86%D0%B8%D0%B5%D0%BD%D1%82_%D0%96%D0%B0%D0%BA%D0%BA%D0%B0%D1%80%D0%B0)
    
    * [Косинусная мера](https://ru.wikipedia.org/wiki/%D0%92%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F_%D0%BC%D0%BE%D0%B4%D0%B5%D0%BB%D1%8C#%D0%9A%D0%BE%D1%81%D0%B8%D0%BD%D1%83%D1%81%D0%BD%D0%BE%D0%B5_%D1%81%D1%85%D0%BE%D0%B4%D1%81%D1%82%D0%B2%D0%BE)  
    
    _Должно поддерживать = можно быстро перейти с использования одного способа на другой._
    
    [Пример реализации двух методов](https://towardsdatascience.com/overview-of-text-similarity-metrics-3397c4601f50)

## Комментарии

По-простому: нужно приложение, которое получает набор
строк/файлов, среди которых ищем, + поисковый запрос (который также может быть файлом).
После обработки выводим список источников в порядке уменьшения их схожести с текстом поискового запроса 

В решении используется `ArrayList`, тем, кто не знаком, надо погуглить ([например](http://developer.alexanderklimov.ru/android/java/arraylist.php))

Главное требование: гибкость приложения, поскольку в дальнейшем имеющиеся требования могут и будут изменены