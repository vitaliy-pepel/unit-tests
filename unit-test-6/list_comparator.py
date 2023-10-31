class ListComparator:
    
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    def calculate_average(self, lst):
        if not lst:
            return None
            
        total = sum(lst)
        return total / len(lst)

    def compare_lists(self):
        average1 = self.calculate_average(self.list1)
        average2 = self.calculate_average(self.list2)

        if average1 is None or average2 is None:
            return "Ошибка: пустой список"

        if average1 > average2:
            return "Первый список имеет большее среднее значение"
        elif average1 < average2:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"

