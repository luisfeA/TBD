import Vue from 'vue';
import VueRouter from 'vue-router';
import Index from './Index.vue';
import Agregar from './agregar.vue';
import Actors from './Actors.vue';
import VueResource from 'vue-resource';
require("./style.scss");

import App from './App.vue';
Vue.use(VueRouter);
Vue.use(VueResource);
const routes = [
  { path: '/index', alias: '/', component: Index},
  { path:'/actors', component: Actors},
  {path:'/agregar',component: Agregar}
]

// Create the router instance and pass the `routes` option
const router = new VueRouter({
  routes
})

/*var addActor   = new Vue({
    el: 'agregarActor',
    dat:{
      name: ''
    }
  }

)*/

/*var addActor = new Vue({
    el: '/agregar',
    data: {
      actor: [],

    },
    methods: {
      agregarActor(actor){
        fetch('http://localhost:3000/actors/'+ actor.id, {
          body: JSON.stringify(actor),
          method: "PUT",

        })
        .then(()=> {
          null;
        })
      },
    }

  }
)*/

new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
