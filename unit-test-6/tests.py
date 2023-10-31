import pytest
from list_comparator import ListComparator


@pytest.fixture
def list_comparator():
    list1 = [1, 2, 3, 4, 5]
    list2 = [6, 7, 8, 9, 10]
    return ListComparator(list1, list2)


def test_calculate_average_with_non_empty_list(list_comparator):
    lst = [1, 2, 3, 4, 5]
    average = list_comparator.calculate_average(lst)
    assert average == 3


def test_calculate_average_with_empty_list(list_comparator):
    lst = []
    average = list_comparator.calculate_average(lst)
    assert average is None


def test_compare_lists_with_higher_average_in_first_list(list_comparator):
    result = list_comparator.compare_lists()
    assert result == "Второй список имеет большее среднее значение"


def test_compare_lists_with_higher_average_in_second_list(list_comparator):
    list1 = [1, 2, 3]
    list2 = [4, 5, 6]
    list_comparator = ListComparator(list1, list2)
    result = list_comparator.compare_lists()
    assert result == "Первый список имеет большее среднее значение"


def test_compare_lists_with_equal_averages(list_comparator):
    list1 = [1, 2, 3]
    list2 = [4, 5, 6]
    list_comparator = ListComparator(list1, list2)
    result = list_comparator.compare_lists()
    assert result == "Средние значения равны"
