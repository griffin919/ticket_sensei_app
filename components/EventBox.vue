<template>
    <div class="eventboxclass" >
        <div>
            <img class="eventbanner" src="../static/badbitch.webp" alt="poster" srcset="">
        </div>
        <div style="padding: 0 10px 10px 10px;">
            <div style="padding: 10px 0px;">
                <!-- Event name-->
                <p class="bannertext">Bad bitches all day</p>
            </div>
            <div style="display: flex; flex-direction: row; justify-content: space-between;">
                <div>
                <!-- Eventcategory -->
                <p class="bannertext">VIP</p>
                </div>
                <div>
                    <!-- Event Rate -->
                    <p class="bannertext">GHC100</p>
                </div>
            </div>
        </div>
    </div>
<!-- 
    <div class="bg-white">
    <div class="mx-auto max-w-2xl px-4 py-16 sm:px-6 sm:py-24 lg:max-w-7xl lg:px-8">
      <h2 class="text-2xl font-bold tracking-tight text-gray-900">Customers also purchased</h2>

      <div class="mt-6 grid grid-cols-1 gap-x-6 gap-y-10 sm:grid-cols-2 lg:grid-cols-4 xl:gap-x-8">
        <div v-for="product in products" :key="product.id" class="group relative">
          <div class="aspect-h-1 aspect-w-1 w-full overflow-hidden rounded-md bg-gray-200 lg:aspect-none group-hover:opacity-75 lg:h-80">
            <img :src="product.imageSrc" :alt="product.imageAlt" class="h-full w-full object-cover object-center lg:h-full lg:w-full" />
          </div>
          <div class="mt-4 flex justify-between">
            <div>
              <h3 class="text-sm text-gray-700">
                <a :href="product.href">
                  <span aria-hidden="true" class="absolute inset-0" />
                  {{ product.name }}
                </a>
              </h3>
              <p class="mt-1 text-sm text-gray-500">{{ product.color }}</p>
            </div>
            <p class="text-sm font-medium text-gray-900">{{ product.price }}</p>
          </div>
        </div>
      </div>
    </div>
  </div> -->

</template>
<script>

export default {
methods: {
  async fetchData(){
    try{
      const tickets = await $fetch('http://localhost:8080/api/ticket/')
      console.log("tickets", tickets);
    }
    catch(error) {error.data}
  }
 },

 created(){
  this.fetchData();
 }
}
</script>

<style>
.eventbanner {
    object-fit: cover;
    object-position: 50% 50%;
}

.bannertext {
    font-weight: 500;
}

.eventboxclass {
    max-width: 200px;
    max-height: 400px;
    background-color: white;
    border-radius: 15px;
    overflow: hidden;
    box-shadow: 2px 2px 2px 2px rgba(0, 0, 0, 0.1);;
}
</style>