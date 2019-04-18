package classes0417;

import classes0414.HeavyBox;

import java.util.*;

public class HeavyBoxReformDemo {
    public static void main(String[] args) {
        List<HeavyBox> boxlist = new ArrayList<>();
        boxlist.add(new HeavyBox(400));
        boxlist.add(new HeavyBox(300));
        boxlist.add(new HeavyBox(800));
        boxlist.add(new HeavyBox(900));
        boxlist.add(new HeavyBox(1000));
        System.out.println(boxlist);

        //HomeWork--------------------------------------------
        Object[] objectArray = boxlist.toArray();
        System.out.println("New Array 1:");
        System.out.println(Arrays.toString(objectArray));
        System.out.println();

        HeavyBox[] heavyBoxes = new HeavyBox[boxlist.size()];
        boxlist.toArray(heavyBoxes);
        System.out.println("New Array 2:");
        System.out.println(Arrays.toString(heavyBoxes));
        System.out.println();

        HeavyBox[] heavyBoxes1 = boxlist.toArray(new HeavyBox[0]);
        System.out.println("New Array 3:");
        System.out.println(Arrays.toString(heavyBoxes1));
        //-----------------------------------------------------
        List<HeavyBox> superHB = getSuperHeavyBoxes(boxlist);
        superHB.forEach(System.out::println);

        boxlist.forEach(b -> System.out.print(b.getWeight() + ", "));

        boxlist.get(0).weight += 1;
        System.out.println();

        boxlist.remove(boxlist.size() - 1);
        boxlist.forEach(b -> System.out.print(b.getWeight() + ", "));
        System.out.println();



        Comparator<HeavyBox> heavyBoxComparator = Comparator.comparing(HeavyBox::getWeight);
        Set<HeavyBox> heavyBoxSet = new TreeSet<>(heavyBoxComparator);
        heavyBoxSet.add(new HeavyBox(5));
        heavyBoxSet.add(new HeavyBox(4));
        heavyBoxSet.add(new HeavyBox(3));
        heavyBoxSet.add(new HeavyBox(8));
        heavyBoxSet.add(new HeavyBox(1));

        heavyBoxSet.forEach(System.out::println);

    }

    private static List<HeavyBox> getSuperHeavyBoxes(List<HeavyBox> list) {
        List<HeavyBox> result = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox temp = iterator.next();
            if (temp.weight > 500) {
                iterator.remove();
                result.add(temp);
            }
        }
        return result;
    }
}
