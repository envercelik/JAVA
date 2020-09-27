package B01Introduction.P11Examples;

public class E19 {

    public static void main(String[] args) {

        //wall painter : kaç kova boya lazım ?

        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));

        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));


        System.out.println(getBucketCount(3.4,1.5));
        System.out.println(getBucketCount(6.26,2.2));
        System.out.println(getBucketCount(3.26,0.75));




    }


    public static int getBucketCount (double width ,double height , double areaPerBucket , double extraBuckets ) {

        if (width <= 0  || height <= 0 || areaPerBucket <=0 || extraBuckets < 0  ) {

            return -1;
        }
        else
        {
            double area = width * height;

            return  (int) (Math.ceil(area / areaPerBucket) - extraBuckets);

        }

    }


    public static int getBucketCount (double width ,double height , double areaPerBucket  ) {

        if (width <= 0  || height <= 0 || areaPerBucket <=0  ) {

            return -1;
        }
        else
        {
            double area = width * height;

            return  (int) (Math.ceil(area / areaPerBucket));

        }

    }


    public static int getBucketCount (double area , double areaPerBucket  ) {

        if (area <= 0   || areaPerBucket <=0  ) {

            return -1;
        }
        else
        {
            return  (int) (Math.ceil(area / areaPerBucket));

        }

    }
}

